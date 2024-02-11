
//syed ali kazmi 
//22i-2472
//se-b
import java.util.Scanner;

public class RentTransaction {
  double calculatedRent;

  RentTransaction() {
  }

  // the private function to calculate the damagecost of the system
  private double damagecostcalculation(double rentalprice, boolean insurance, double insurancecost) {
    double damagecost;
    double minimumdamagecost = 1200;
    System.out.println("Enter the damage percentage of this car");
    Scanner scanner = new Scanner(System.in);
    double percentage = scanner.nextDouble();
    // checking insurance and adding comments
    if (insurance == true) {
      damagecost = Math.max(minimumdamagecost, (percentage * rentalprice) - insurancecost);
    } else {
      damagecost = (percentage * rentalprice);
    }
    return damagecost;

  }

  // the return car function called when the renters come back to reutrn the car
  public void ReturnCar(Renter Renter, String carnumber, String cartype) {
    if (cartype.equals("Compactcar")) {
      // damage cost calculation for Compact cars
      for (int i = 0; i < Renter.RentedCompactCars.size(); i++) {
        if (Renter.RentedCompactCars.get(i).getPlateNumber().equals(carnumber)) {
          Renter.RentedCompactCars.get(i).setdamagecost(damagecostcalculation(Renter.getTotalRentalFee(),
              Renter.RentedCompactCars.get(i).getinsurrable(), Renter.RentedCompactCars.get(i).getinsuranceamount()));
          System.out.println("The damage cost calculated is  " + Renter.RentedCompactCars.get(i).getdamagecost());
          Renter.RentedCompactCars.remove(i);
        }
      }
    }
    // damage cost calculation for suvcars
    if (cartype.equals("SUVcar")) {
      for (int i = 0; i < Renter.RentedSUVCars.size(); i++) {
        if (Renter.RentedSUVCars.get(i).getPlateNumber().equals(carnumber)) {
          Renter.RentedSUVCars.get(i).setdamagecost(damagecostcalculation(Renter.getTotalRentalFee(),
              Renter.RentedSUVCars.get(i).getinsurrable(), Renter.RentedSUVCars.get(i).getinsuranceamount()));
          System.out.println("The damage cost calculated is  " + Renter.RentedSUVCars.get(i).getdamagecost());
          Renter.RentedSUVCars.remove(i);
        }
      }
    }
    // damagecost calculation for luxury cars
    if (cartype.equals("Luxurycar")) {
      for (int i = 0; i < Renter.RentedLuxuryCars.size(); i++) {
        if (Renter.RentedLuxuryCars.get(i).getPlateNumber().equals(carnumber)) {
          Renter.RentedLuxuryCars.get(i).setdamagecost(damagecostcalculation(Renter.getTotalRentalFee(),
              Renter.RentedLuxuryCars.get(i).getinsurrable(), Renter.RentedLuxuryCars.get(i).getinsuranceamount()));
          System.out.println("The damage cost calculated is  " + Renter.RentedLuxuryCars.get(i).getdamagecost());
          Renter.RentedLuxuryCars.remove(i);
        }
      }
    } else {
      System.out.println("incorrecttype renter!");
    }
    System.out.println("Car returned successfully ");
  }

  // renting a car function
  public Renter RentCar(Renter renter, Car car) {
    // adding the car and displaying the details
    if (car.getcar_type().equals("Compactcar")) {
      renter.RentedCompactCars.add(car);
      System.out.println("Car rented successfully ");
      System.out.println("Car details are");
      System.out.println("Car type: " + car.getcar_type());
      System.out.println("Car brand: " + car.getBrand());
      System.out.println("Car number: " + car.getPlateNumber());
      System.out.println("Car model :" + car.getModel());
      System.out.println("car type :" + car.getcar_type());

    }
    if (car.getcar_type() == "SUVcar") {
      renter.RentedSUVCars.add(car);
      System.out.println("Car rented successfully ");
      System.out.println("Car details are");
      System.out.println("Car type: " + car.getCar_id());
      System.out.println("Car brand: " + car.getBrand());
      System.out.println("Car number: " + car.getPlateNumber());
      System.out.println("Car model :" + car.getModel());
      System.out.println("car type :" + car.getcar_type());

    }
    if (car.getcar_type() == "Luxurycar") {
      renter.RentedLuxuryCars.add(car);
      System.out.println("Car rented successfully ");
      System.out.println("Car details are");
      for (int i = 0; i < renter.RentedLuxuryCars.size(); i++) {
        System.out.println("Car type: " + renter.RentedLuxuryCars.get(i).getCar_id());
        System.out.println("Car brand: " + renter.RentedLuxuryCars.get(i).getBrand());
        System.out.println("Car number: " + renter.RentedLuxuryCars.get(i).getPlateNumber());
        System.out.println("Car model :" + renter.RentedLuxuryCars.get(i).getModel());
        System.out.println("car type :" + renter.RentedLuxuryCars.get(i).getcar_type());
      }
      for (int i = 0; i < renter.RentedCompactCars.size(); i++) {
        System.out.println("Car type: " + renter.RentedCompactCars.get(i).getCar_id());
        System.out.println("Car brand: " + renter.RentedCompactCars.get(i).getBrand());
        System.out.println("Car number: " + renter.RentedCompactCars.get(i).getPlateNumber());
        System.out.println("Car model :" + renter.RentedCompactCars.get(i).getModel());
        System.out.println("car type :" + renter.RentedCompactCars.get(i).getcar_type());
      }
      for (int i = 0; i < renter.RentedSUVCars.size(); i++) {
        System.out.println("Car type: " + renter.RentedSUVCars.get(i).getCar_id());
        System.out.println("Car brand: " + renter.RentedSUVCars.get(i).getBrand());
        System.out.println("Car number: " + renter.RentedSUVCars.get(i).getPlateNumber());
        System.out.println("Car model :" + renter.RentedSUVCars.get(i).getModel());
        System.out.println("car type :" + renter.RentedSUVCars.get(i).getcar_type());
      }
    }
    System.out.println("----------------------------");
    // displaying the renters details
    System.out.println("Renter details are");
    System.out.println("Renter Name :" + renter.getRenter_name());
    System.out.println("Renter ID" + renter.getRenter_id());
    System.out.println("Renter Address" + renter.getRenter_address());
    System.out.println("Renter Email" + renter.getRenter_Email());
    System.out.println("Renter Contact Number" + renter.getRenter_contactnumber());
    System.out.println("Renter Type :" + renter.getrentertype());
    System.out.println("Enter the number of kms driven");
    Scanner scanner = new Scanner(System.in);
    int distance = scanner.nextInt();
    renter.setTotalRentalFee(calculateRent(car, distance, renter));
    System.out.println("Rent for the car is " + renter.getTotalRentalFee());
    return renter;
  }

  // function kept private to hide it from irrelevant sector
  private double calculateRent(Car car, int distance, Renter renter) {
    if (car.getcar_type().equals("SUVcar") || (car.getcar_type().equals("Luxurycar"))) {
      System.out.println("Enter 1 if you want to add insurance cost and 2 if not");
      Scanner scanner = new Scanner(System.in);
      int input = scanner.nextInt();
      switch (input) {
        case 1: { // when insurance is true
          if (renter.getrentertype().equals("RegularRenter")) {
            calculatedRent = car.calculaterentalfee(distance, 30000, true);

          } else if (renter.getrentertype().equals("FrequentRenter")) {
            calculatedRent = car.calculaterentalfee(distance, 40000, true);
          } else if (renter.getrentertype().equals("CorporateRenter")) {
            calculatedRent = car.calculaterentalfee(distance, 55000, true);
          }
          System.out.println("insurance ammount is involved !");
        }
          break;
        case 2: {
          // to set the insurance status to false of
          if (renter.getrentertype().equals("RegularRenter")) {

            calculatedRent = car.calculaterentalfee(distance, 30000, false);
          } else if (renter.getrentertype().equals("FrequentRenter")) {
            calculatedRent = car.calculaterentalfee(distance, 40000, false);

          } else if (renter.getrentertype().equals("CorporateRenter")) {
            calculatedRent = car.calculaterentalfee(distance, 55000, false);
          }
        }
        default:
          break;
      }
    } else {
      if (renter.getrentertype().equals("RegularRenter")) {
        calculatedRent = car.calculaterentalfee(distance, 30000, false);

      } else if (renter.getrentertype().equals("FrequentRenter")) {

        calculatedRent = car.calculaterentalfee(distance, 40000, false);

      } else if (renter.getrentertype().equals("CorporateRenter")) {
        calculatedRent = car.calculaterentalfee(distance, 55000, false);
      }
    }

    return calculatedRent;
  }

}
