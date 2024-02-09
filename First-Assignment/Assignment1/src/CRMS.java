import java.util.ArrayList;
import java.util.Scanner;

public class CRMS {
    ArrayList<Renter> Renters;

    CRMS() {
        Renters = new ArrayList<>();
        System.out.println("Welcome to CRMS (Car and renter management system)");
    }

    public void CRMSfunctionality() {
        CarManagement carmanagement = new CarManagement();

        RentTransaction renttransaction = new RentTransaction();
        RenterManagement rentermanagement = new RenterManagement();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Please select an option:");
                System.out.println("1. Car Management");
                System.out.println("2. Renter Management");
                System.out.println("3. Exit");

                int option = scanner.nextInt();

                switch (option) {
                    case 1: {
                        System.out.println("Please select an option:");
                        System.out.println("1. Add car");
                        System.out.println("2. Display available cars");
                        System.out.println("3. Remove car");
                        int carOption = scanner.nextInt();
                        switch (carOption) {
                            case 1: {
                                System.out.println("Enter car details:");
                                System.out.println("Car type:");
                                String carType = scanner.next();
                                System.out.println("Car brand:");
                                String carbrand = scanner.next();
                                System.out.println("Car number:");
                                String carNumber = scanner.next();
                                System.out.println("Car model:");
                                String model = scanner.next();
                                System.out.println("Car id:");
                                int car_id = scanner.nextInt();
                                carmanagement.addCar(carType, model, carbrand, carNumber, car_id);
                                break;
                            }
                            case 2: {
                                carmanagement.DisplayavailableCars();
                            }
                                break;
                            case 3: {
                                System.out.println("Enter car id to remove:");
                                int carNumberToRemove = scanner.nextInt();
                                carmanagement.removeCar(carNumberToRemove);
                            }
                                break;
                            default: {
                                System.out.println("Invalid option. Please try again.");
                            }
                        }
                    }
                        break;
                    case 2: {
                        System.out.println("Please select an option:");
                        System.out.println("1. Add renter");
                        System.out.println("2. Display renter details");
                        System.out.println("3. Remove renter");
                        System.out.println("4. Rent a car");
                        System.out.println("5. Remove a car from rentor ");
                        System.out.println("6. print the rentors who have taken cars details");
                        System.out.println("7. Exit");
                        int renterOption = scanner.nextInt();
                        switch (renterOption) {
                            case 1: {
                                System.out.println("Enter renter details:");
                                System.out.println("Renter id:");
                                int renterId = scanner.nextInt();
                                System.out.println("Renter name:");
                                String renterName = scanner.next();
                                System.out.println("Renter address:");
                                String renterAddress = scanner.next();
                                System.out.println("Renter email:");
                                String renterEmail = scanner.next();
                                System.out.println("Renter contact number:");
                                String renterContactNumber = scanner.next();
                                System.out.println("Renter type:(FrequentRenter/CorporateRenter/RegularRenter)");
                                String renterType = scanner.next();
                                System.out.println("The Renter Type is " + renterType);

                                rentermanagement.addRenter(renterId, renterName, renterEmail, renterContactNumber,
                                        renterAddress,
                                        renterType);
                            }
                                break;
                            case 2: {
                                System.out.println("Enter renter id:");
                                int renterId = scanner.nextInt();
                                System.out.println("The Renter id is: " + renterId);
                                rentermanagement.DisplayRenterDetails(renterId);
                            }
                                break;
                            case 3: {
                                System.out.println("Enter renter id to remove:");
                                int renterIdToRemove = scanner.nextInt();
                                rentermanagement.removeRenter(renterIdToRemove);
                            }
                                break;
                            case 4: {
                                System.out.println("Enter renter id:");
                                int id = scanner.nextInt();
                                System.out.println("Enter car type:(Compactcar/Luxurycar/SUVcar)");
                                String cartype = scanner.next();
                                Car car = carmanagement.findCar(cartype);
                                Renter renter = rentermanagement.findRenterById(id);
                                Renter temp = renttransaction.RentCar(renter, car);
                                System.out.print(temp.getRenter_Email());
                                System.out.println(temp.RentedCompactCars.get(0).getCar_id());
                                Renters.add(temp);
                            }
                                break;
                            case 5: {
                                System.out.print("Enter the id of the rentor who has returned the car");
                                int id = scanner.nextInt();
                                System.out.println("Enter the car number");
                                String carnumber = scanner.next();
                                System.out.println("Enter the car Type");
                                String cartype = scanner.next();
                                Renter renter = rentermanagement.findRenterById(id);
                                if (Renters.contains(renter)) {
                                    renttransaction.ReturnCar(renter, carnumber, cartype);
                                    Renters.remove(renter);
                                } else {
                                    System.out.println("The renter has not rented any car");

                                }
                            }
                                break;
                            case 6: {
                                ;
                                for (int i = 0; i < Renters.size(); i++) {
                                    System.out.println("The rentor id is " + Renters.get(i).getRenter_id());
                                    System.out.println("The rentor name is " + Renters.get(i).getRenter_name());

                                    System.out.println("The rentor type is " + Renters.get(i).getrentertype());
                                    System.out.println("The rented cars by the rentor are");
                                    System.out
                                            .println("size of compact cars" + Renters.get(i).RentedCompactCars.size());
                                    System.out.println("size of SUV cars" + Renters.get(i).RentedSUVCars.size());
                                    System.out.println("size of Luxury cars" + Renters.get(i).RentedLuxuryCars.size());
                                    for (int j = 0; j < Renters.get(i).RentedCompactCars.size(); j++) {

                                        System.out.println(Renters.get(i).RentedCompactCars.get(j).getcar_type());
                                        System.out.println(Renters.get(i).RentedCompactCars.get(j).getBrand());
                                        System.out.println(Renters.get(i).RentedCompactCars.get(j).getPlateNumber());
                                        System.out.println(Renters.get(i).RentedCompactCars.get(j).getRentalFee());
                                    }
                                    for (int j = 0; j < Renters.get(i).RentedSUVCars.size(); j++) {

                                        System.out.println(Renters.get(i).RentedSUVCars.get(j).getcar_type());
                                        System.out.println(Renters.get(i).RentedSUVCars.get(j).getBrand());
                                        System.out.println(Renters.get(i).RentedSUVCars.get(j).getPlateNumber());
                                        System.out.println(Renters.get(i).RentedSUVCars.get(j).getRentalFee());
                                    }
                                    for (int j = 0; j < Renters.get(i).RentedLuxuryCars.size(); j++) {

                                        System.out.println(Renters.get(i).RentedLuxuryCars.get(j).getcar_type());
                                        System.out.println(Renters.get(i).RentedLuxuryCars.get(j).getBrand());
                                        System.out.println(Renters.get(i).RentedLuxuryCars.get(j).getPlateNumber());
                                        System.out.println(Renters.get(i).RentedLuxuryCars.get(j).getRentalFee());
                                    }

                                }
                                break;
                            }
                            case 7: {
                                System.out.println("Exiting...");
                            }
                                return;
                            default:
                                System.out.println("Invalid option. Please try again.");
                        }
                    }
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }
}
