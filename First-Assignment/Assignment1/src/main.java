import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        CarManagement carmanagement = new CarManagement();
    
        RentTransaction renttransaction = new RentTransaction();
        RenterManagement renter = new RenterManagement();
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
                        System.out.println("5. Exit");
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

                                renter.addRenter(renterId, renterName, renterEmail, renterContactNumber, renterAddress,
                                        renterType);
                            }
                                break;
                            case 2: {
                                System.out.println("Enter renter id:");
                                int renterId = scanner.nextInt();
                                System.out.println("The Renter id is: " + renterId);
                                renter.DisplayRenterDetails(renterId);
                            }
                                break;
                            case 3: {
                                System.out.println("Enter renter id to remove:");
                                int renterIdToRemove = scanner.nextInt();
                                renter.removeRenter(renterIdToRemove);
                            }
                                break;
                            case 4: {
                                renter.RentCar();
                            }

                            case 5: {
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