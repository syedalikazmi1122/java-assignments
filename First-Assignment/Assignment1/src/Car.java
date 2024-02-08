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
    private double insurranceammount = 0;
    private double luxurycartax;
    private String PlateNumber;
    protected int numberofcars;
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
    }

    // The getters and setters
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

    protected double calculaterentalfee(float distancetravelled, double costofunitrent) {
        if (CarType == "Compactcar" || CarType == "SUVcar") {
            RentalFee = (distancetravelled * costofunitrent) + base_Ammount;
        } else if (CarType == "Luxury") {
            RentalFee = base_Ammount + (distancetravelled * costofunitrent)
                    + luxurycartax;
        }
        return RentalFee;

    }

    public void getFeatures() {
        // TODO Auto-generated method stub
        }

}
