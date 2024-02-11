

//syed ali kazmi 
//22i-2472
//se-b
public class CorporateRenter extends Renter {
    CorporateRenter(int Renter_id, String Renter_name, String Renter_Email, String Renter_contactnumber,
            String Renter_address, String RenterType) {
        super(Renter_id, Renter_name, Renter_Email, Renter_contactnumber, Renter_address, RenterType);
    }

    public void viewfeatures() {
        System.out.println(
                "Standard Rent  Rates  set by the company are applied on this type : \n 7000 for compact cars \n 15000 for SUV cars \n 25000 for Luxury cars ");
    }
}
