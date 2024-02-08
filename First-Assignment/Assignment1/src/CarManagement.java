import java.util.ArrayList;

public class CarManagement {

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

        if (cartype.equals("Compactcar")) {
            Compactcar newcar = new Compactcar(car_id, brand, model, plateNumber);
            compactCars.add(newcar);
        } else if (cartype.equals("SUVcar")) {

            SUVCars newcar = new SUVCars(car_id, brand, model, plateNumber);
            suvCars.add(newcar);
        } else if (cartype.equals("Luxurycar")) {

            LuxuryCar newcar = new LuxuryCar(car_id, brand, model, plateNumber);
            luxuryCars.add(newcar);
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
    public void DisplayavailableCars() {
        for (int i = 0; i < compactCars.size(); i++) {
            if (compactCars.get(i).getRentalstatus() == false) {
                System.out.println("The car id is: " + compactCars.get(i).getCar_id());
                System.out.println("The brand of the car is: " + compactCars.get(i).getBrand());
                System.out.println("The model of the car is: " + compactCars.get(i).getModel());
                System.out.println("The rental status of the car is: " + compactCars.get(i).getRentalstatus());
                System.out.println("The plate number of the car is: " + compactCars.get(i).getPlateNumber());
            }
        }
        for (int i = 0; i < suvCars.size(); i++) {
            if (suvCars.get(i).getRentalstatus() == false) {
                System.out.println("The car id is: " + suvCars.get(i).getCar_id());
                System.out.println("The brand of the car is: " + suvCars.get(i).getBrand());
                System.out.println("The model of the car is: " + suvCars.get(i).getModel());
                System.out.println("The rental status of the car is: " + suvCars.get(i).getRentalstatus());
                System.out.println("The plate number of the car is: " + suvCars.get(i).getPlateNumber());

            }
        }
        System.out.println("The available luxury cars are: ");
        for (int i = 0; i < luxuryCars.size(); i++) {
            if (luxuryCars.get(i).getRentalstatus() == false) {
                System.out.println("The car id is: " + luxuryCars.get(i).getCar_id());
                System.out.println("The brand of the car is: " + luxuryCars.get(i).getBrand());
                System.out.println("The model of the car is: " + luxuryCars.get(i).getModel());
                System.out.println("The rental status of the car is: " + luxuryCars.get(i).getRentalstatus());
                System.out.println("The plate number of the car is: " + luxuryCars.get(i).getPlateNumber());
            }
        }
    }
}
