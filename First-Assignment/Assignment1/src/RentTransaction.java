import java.util.Scanner;

public class RentTransaction {

  double calculatedRent;


  RentTransaction() {

  }

   public void ReturnCar(Renter Renter, String carnumber, String cartype) {
  
  if (cartype == "Compactcar") {
    for (int i = 0; i < Renter.RentedCompactCars.size(); i++) {
      if (Renter.RentedCompactCars.get(i).getPlateNumber() == carnumber) {
        Renter.RentedCompactCars.remove(i);
      }
    }
  }
  if (cartype == "SUVcar") {
  for (int i = 0; i < Renter.RentedSUVCars.size(); i++) {
    if (Renter.RentedSUVCars.get(i).getPlateNumber() == carnumber) {
      Renter.RentedSUVCars.remove(i);
    }
  }
  }
  if(cartype == "Luxurycar") {
    for (int i = 0; i < Renter.RentedLuxuryCars.size(); i++) {
      if (Renter.RentedLuxuryCars.get(i).getPlateNumber() == carnumber) {
        Renter.RentedLuxuryCars.remove(i);
      }
    }
  }
  System.out.println("Car returned successfully ");
  }
  public Renter RentCar(Renter renter, Car car) {
    System.out.println("Renter is " + renter.Renter_id);
    System.out.println("Car is " + car.getBrand());
    if (car.getcar_type() == "Compactcar") {
      renter.RentedCompactCars.add(car);
      System.out.println("Car rented successfully ");
      System.out.println("Car details are");
      System.out.println("Car type: " + car.getCar_id());
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
      for(int i=0;i<renter.RentedLuxuryCars.size();i++)
      {
      System.out.println("Car type: " + renter.RentedLuxuryCars.get(i).getCar_id());
      System.out.println("Car brand: " + renter.RentedLuxuryCars.get(i).getBrand());
      System.out.println("Car number: " + renter.RentedLuxuryCars.get(i).getPlateNumber());
      System.out.println("Car model :" + renter.RentedLuxuryCars.get(i).getModel());
      System.out.println("car type :" + renter.RentedLuxuryCars.get(i).getcar_type());
      }
      for(int i=0;i<renter.RentedCompactCars.size();i++)
      {
      System.out.println("Car type: " + renter.RentedCompactCars.get(i).getCar_id());
      System.out.println("Car brand: " + renter.RentedCompactCars.get(i).getBrand());
      System.out.println("Car number: " + renter.RentedCompactCars.get(i).getPlateNumber());
      System.out.println("Car model :" + renter.RentedCompactCars.get(i).getModel());
      System.out.println("car type :" + renter.RentedCompactCars.get(i).getcar_type());
      }
      for(int i=0;i<renter.RentedSUVCars.size();i++)
      {
      System.out.println("Car type: " + renter.RentedSUVCars.get(i).getCar_id());
      System.out.println("Car brand: " + renter.RentedSUVCars.get(i).getBrand());
      System.out.println("Car number: " + renter.RentedSUVCars.get(i).getPlateNumber());
      System.out.println("Car model :" + renter.RentedSUVCars.get(i).getModel());
      System.out.println("car type :" + renter.RentedSUVCars.get(i).getcar_type());
      }
      
    }
     System.out.println("----------------------------");
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

  private double calculateRent(Car car, int distance, Renter renter) {
    if (car.getcar_type().equals("SUV") || (car.getcar_type().equals("Luxury"))) {
      System.out.println("Enter 1 if you want to add insurance cost and 2 if not");
      Scanner scanner = new Scanner(System.in);
      int input = scanner.nextInt();
      switch (input) {
        case 1: {
          if (renter.getrentertype().equals("RegularRenter")) {
            calculatedRent = car.calculaterentalfee(distance, 30000, true);
            System.out.println("the calculated Rent against " + distance + " kms is " + car.getRentalFee());
          } else if (renter.getrentertype().equals("FrequentRenter")) {
            System.out.println("aa");
            calculatedRent = car.calculaterentalfee(distance, 40000, true);
          } else if (renter.getrentertype().equals("CorporateRenter")) {
            calculatedRent = car.calculaterentalfee(distance, 55000, true);
          }
          System.out.println("insurance ammount is involved !");
        }
          break;
        case 2: {
          if (renter.getrentertype().equals("RegularRenter")) {
            calculatedRent = car.calculaterentalfee(distance, 30000, false);
            System.out.println("the calculated Rent against " + distance + " kms is " + car.getRentalFee());
          } else if (renter.getrentertype().equals("FrequentRenter")) {
            System.out.println("aa");
            calculatedRent = car.calculaterentalfee(distance, 40000, false);
          } else if (renter.getrentertype().equals("CorporateRenter")) {
            calculatedRent = car.calculaterentalfee(distance, 55000, false);
          }
        }
        default:
          break;
      }
    }
    else 
    {
      if (renter.getrentertype().equals("RegularRenter")) {
        calculatedRent = car.calculaterentalfee(distance, 30000, false);
        System.out.println("the calculated Rent against " + distance + " kms is " + car.getRentalFee());
      } else if (renter.getrentertype().equals("FrequentRenter")) {
        System.out.println("aa");
        calculatedRent = car.calculaterentalfee(distance, 40000, false);
      } else if (renter.getrentertype().equals("CorporateRenter")) {
        calculatedRent = car.calculaterentalfee(distance, 55000, false);
      }
    }

    System.out.println("calculatedRent:" + calculatedRent);
    return calculatedRent;
  }

 

}
