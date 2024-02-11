
//syed ali kazmi 
//22i-2472
//se-b
import java.util.ArrayList;

public class CarManagement implements management {

    private ArrayList<Compactcar> compactCars;
    private ArrayList<SUVCars> suvCars;
    private ArrayList<LuxuryCar> luxuryCars;
    private static int numberofcars = 0;

    public CarManagement() {
        this.compactCars = new ArrayList<>();
        this.suvCars = new ArrayList<>();
        this.luxuryCars = new ArrayList<>();
    }

    // the function to add a car
    public void addCar(String cartype, String model, String brand, String plateNumber, int car_id) {
//      to check if the car already exists;
    	for (int i = 0; i < compactCars.size(); i++) {
            if (compactCars.get(i).getCar_id() == car_id) {
                System.out.println("car with this id already exists");
                return;
            }
        }
        for (int i = 0; i < suvCars.size(); i++) {
            if (suvCars.get(i).getCar_id() == car_id) {
                System.out.println("car with this id already exists");
                return;
            }
        }
        for (int i = 0; i < luxuryCars.size(); i++) {
            if (luxuryCars.get(i).getCar_id() == car_id) {
                System.out.println(" car with this id already exists");
                return;
            }
        }
//  to check if the car with car-registeration number already exists?        
        for (int i = 0; i < compactCars.size(); i++) {
            if (compactCars.get(i).getPlateNumber().equals(plateNumber) ) {
                System.out.println(" car with this Number plate already exists");
                return;
            }
        }
        for (int i = 0; i < suvCars.size(); i++) {
            if (suvCars.get(i).getPlateNumber().equals(plateNumber)) {
                System.out.println(" car with this Number plate already exists");
                return;
            }
        }
        for (int i = 0; i < luxuryCars.size(); i++) {
            if (luxuryCars.get(i).getPlateNumber().equals(plateNumber)) {
                System.out.println(" car with this Number plate already exists");
                return;
            }
        }
        if (cartype.equals("Compactcar")) {
            Compactcar newcar = new Compactcar(car_id, brand, model, plateNumber);
            compactCars.add(newcar);
            System.out.println("Car added");
        } else if (cartype.equals("SUVcar")) {

            SUVCars newcar = new SUVCars(car_id, brand, model, plateNumber);
            suvCars.add(newcar);
            System.out.println("Car added");
        } else if (cartype.equals("Luxurycar")) {

            LuxuryCar newcar = new LuxuryCar(car_id, brand, model, plateNumber);
            luxuryCars.add(newcar);
            System.out.println("Car added");
        } else {
            System.out.println("Invalid car type");
        }
    }

    // remove a car with id car_id
    public void removeCar(int car_id) {
        for (int i = 0; i < compactCars.size(); i++) {
            if (compactCars.get(i).getCar_id() == car_id) {
                compactCars.remove(i);
                return;
            }
        }
        for (int i = 0; i < suvCars.size(); i++) {
            if (suvCars.get(i).getCar_id() == car_id) {
                suvCars.remove(i);
                return;
            }
        }
        for (int i = 0; i < luxuryCars.size(); i++) {
            if (luxuryCars.get(i).getCar_id() == car_id) {
                luxuryCars.remove(i);
                return;
            }
        }
        System.out.println("car with this id does not exist");
    }

    // to display car details
    @Override
    public void Display() {
//    	 to display compact cars
        for (int i = 0; i < compactCars.size(); i++) {
            if (compactCars.get(i).getRentalstatus() == false) {
                System.out.println("The car id is: " + compactCars.get(i).getCar_id());
                System.out.println("The brand of the car is: " + compactCars.get(i).getBrand());
                System.out.println("The model of the car is: " + compactCars.get(i).getModel());
                System.out.println("The rental status of the car is: " + compactCars.get(i).getRentalstatus());
                System.out.println("The car type  is: " + compactCars.get(i).getcar_type());
                System.out.println("The plate number of the car is: " + compactCars.get(i).getPlateNumber());
            }
        }
        System.out.println("-------------------------------------");
//       to display suvcars
        for (int i = 0; i < suvCars.size(); i++) {
            if (suvCars.get(i).getRentalstatus() == false) {
                System.out.println("The car id is: " + suvCars.get(i).getCar_id());
                System.out.println("The brand of the car is: " + suvCars.get(i).getBrand());
                System.out.println("The model of the car is: " + suvCars.get(i).getModel());
                System.out.println("The car type  is: " + suvCars.get(i).getcar_type());
                System.out.println("The rental status of the car is: " + suvCars.get(i).getRentalstatus());
                System.out.println("The plate number of the car is: " + suvCars.get(i).getPlateNumber());

            }
        }
        System.out.println("-------------------------------------");
//        to display luxury cars
        for (int i = 0; i < luxuryCars.size(); i++) {
            if (luxuryCars.get(i).getRentalstatus() == false) {
                System.out.println("The car id is: " + luxuryCars.get(i).getCar_id());
                System.out.println("The brand of the car is: " + luxuryCars.get(i).getBrand());
                System.out.println("The model of the car is: " + luxuryCars.get(i).getModel());
                System.out.println("The car type  is: " + luxuryCars.get(i).getcar_type());
                System.out.println("The rental status of the car is: " + luxuryCars.get(i).getRentalstatus());
                System.out.println("The plate number of the car is: " + luxuryCars.get(i).getPlateNumber());
            }
        }
        System.out.println("-------------------------------------");
    }

    // find a car function with cartype and rental status false.
    public Car findCar(String Cartype) {
        if (Cartype.equals("Compactcar")) {
            for (int i = 0; i < compactCars.size(); i++) {
                if (compactCars.get(i).getRentalstatus() == false) {
                    compactCars.get(i).setRentalstatus(true);
                    return compactCars.get(i);
                }
            }
        } else if (Cartype.equals("SUVcar")) {
            for (int i = 0; i < suvCars.size(); i++) {
                if (suvCars.get(i).getRentalstatus() == false) {
                    suvCars.get(i).setRentalstatus(true);
                    return suvCars.get(i);
                }
            }
        } else if (Cartype.equals("Luxurycar")) {
            for (int i = 0; i < luxuryCars.size(); i++) {
                if (luxuryCars.get(i).getRentalstatus() == false) {
                    luxuryCars.get(i).setRentalstatus(true);
                    return luxuryCars.get(i);
                }
            }
        }
        return null;
    }
}

