//syed ali kazmi 
//22i-2472
//se-b

public class Car {
	 // basic data for the car
    private int Car_id;
    private String Brand;
    private String Model;
    private String CarType;
    private Boolean Rentalstatus;
    private boolean insurrable;
    private double RentalFee;
    private double base_Ammount = 0;
    private double insuranceamount ;
    private double insurancepercentage;
    private double costofunitrent;
    private double luxurycartax;
    private double damagecost;
    private String PlateNumber;
    public Car(int Car_id, String CarType, String Brand, String Model, Boolean Rentalstatus, String PlateNumber,
            boolean insurrable, double base_Ammount) {
        this.Car_id = Car_id;
        this.CarType = CarType;
        this.Brand = Brand;
        this.Model = Model;
        this.Rentalstatus = Rentalstatus;
        this.PlateNumber = PlateNumber;
        this.insurrable = insurrable;
        this.base_Ammount = base_Ammount;
        luxurycartax = 10000;
        insurancepercentage=.10;
        insuranceamount=0;
        costofunitrent = 10;
        damagecost =0;
        
    }

    // The getters and setters
    protected String getcar_type() {
        return CarType;
    }

    protected int getCar_id() {
        return Car_id;
    }

    protected void setCar_id(int Car_id) {
        this.Car_id = Car_id;
    }

    protected String getBrand() {
        return Brand;
    }

    protected void setBrand(String Brand) {
        this.Brand = Brand;
    }

    protected String getModel() {
        return Model;
    }

    protected void setModel(String Model) {
        this.Model = Model;
    }

    protected Boolean getRentalstatus() {
        return Rentalstatus;
    }

    protected void setRentalstatus(Boolean Rentalstatus) {
        this.Rentalstatus = Rentalstatus;
    }

    protected double getRentalFee() {
        return RentalFee;
    }

    protected void setRentalFee(double RentalFee) {
        this.RentalFee = RentalFee;
    }

    protected String getPlateNumber() {
        return PlateNumber;
    }

    public void setPlateNumber(String PlateNumber) {
        this.PlateNumber = PlateNumber;
    }

    protected void setinsurrable(boolean insurrable) {
        this.insurrable = insurrable;
    }

    protected boolean getinsurrable() {
        return insurrable;
    }

    protected double getbase_Ammount() {
        return base_Ammount;
    }
    protected void setdamagecost(double d)
    {
    	damagecost = d;
    }
    protected double getdamagecost()
    {
    	return damagecost;
    }
  protected double getinsuranceamount()
  {
	  return insuranceamount;
  }
//  calculating the rent and insurance of the car rented
    protected double calculaterentalfee(double distancetravelled, double base ,boolean insurrable) {
     
    	this.insurrable = insurrable;
        if (CarType.equals("Compactcar") || CarType.equals("SUVcar")) {
            RentalFee = (distancetravelled * costofunitrent) + base;
        } else if (CarType.equals("Luxurycar")) {
            RentalFee = base_Ammount + (distancetravelled * costofunitrent)
                    + luxurycartax;
        }
       if(insurrable)
       {
    	   insuranceamount = insurancepercentage*RentalFee;
          System.out.println("the insurance amount is "+insuranceamount);
    	   RentalFee=RentalFee-(insurancepercentage*RentalFee);
       }
        return RentalFee;

    }

    public void getFeatures() {
        // TODO Auto-generated method stub
    }
}
