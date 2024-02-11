
//syed ali kazmi 

//22i-2472
//se-b

import java.util.ArrayList;

public class Renter {
    protected int Renter_id;
    private String Renter_name;
    private String Renter_Email;
    private String Renter_contactnumber;
    private String Renter_address;
    private double TotalRentalFee;
    private String renterType;
    protected ArrayList<Car> RentedCompactCars;
    protected ArrayList<Car> RentedLuxuryCars;
    protected ArrayList<Car> RentedSUVCars;

    public Renter(int Renter_id, String Renter_name, String Renter_Email, String Renter_contactnumber,
            String Renter_address, String rentertype) {
        this.Renter_id = Renter_id;
        this.Renter_name = Renter_name;
        this.Renter_Email = Renter_Email;
        this.Renter_contactnumber = Renter_contactnumber;
        this.Renter_address = Renter_address;
        this.renterType = rentertype;
        RentedCompactCars = new ArrayList<>();
        RentedLuxuryCars = new ArrayList<>();
        RentedSUVCars = new ArrayList<>();
    }

    public int getRenter_id() {
        return Renter_id;
    }

    public void setRenter_id(int Renter_id) {
        this.Renter_id = Renter_id;
    }

    public String getRenter_name() {
        return Renter_name;
    }

    public void setRenter_name(String Renter_name) {
        this.Renter_name = Renter_name;
    }

    public String getrentertype() {
        return renterType;
    }

    public String getRenter_Email() {
        return Renter_Email;
    }

    public void setRenter_Email(String Renter_Email) {
        this.Renter_Email = Renter_Email;
    }

    public String getRenter_contactnumber() {
        return Renter_contactnumber;
    }

    public void setRenter_contactnumber(String Renter_contactnumber) {
        this.Renter_contactnumber = Renter_contactnumber;
    }

    public String getRenter_address() {
        return Renter_address;
    }

    public void setRenter_address(String Renter_address) {
        this.Renter_address = Renter_address;
    }

    public double getTotalRentalFee() {
        return TotalRentalFee;
    }

    public void setTotalRentalFee(double TotalRentalFee) {
        this.TotalRentalFee = TotalRentalFee;
    }
}
