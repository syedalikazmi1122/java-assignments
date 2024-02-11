

//syed ali kazmi 
//22i-2472
//se-b
import java.util.ArrayList;

public class RenterManagement implements management {

    private ArrayList<RegularRenter> RegularRenters;
    private ArrayList<CorporateRenter> CorporateRenters;
    private ArrayList<FrequentRenter> Frequentrenter;

    RenterManagement() {
        RegularRenters = new ArrayList<>();
        CorporateRenters = new ArrayList<>();
        Frequentrenter = new ArrayList<>();
    }

    // functions to add a Renter
    public void addRenter(int Renter_id, String Renter_name, String Renter_Email, String Renter_contactnumber,
            String Renter_address, String RenterType) {
        // checking if the Renter with the same id already exists
        for (int i = 0; i < Frequentrenter.size(); i++) {
            if (Frequentrenter.get(i).getRenter_id() == Renter_id) {
                System.out.println("Renter with this id already exists");
                return;
            }
        }
        for (int i = 0; i < RegularRenters.size(); i++) {

            if (RegularRenters.get(i).getRenter_id() == Renter_id) {
                System.out.println("Renter with this id already exists");
                return;
            }
        }
        for (int i = 0; i < CorporateRenters.size(); i++) {
            if (CorporateRenters.get(i).getRenter_id() == Renter_id) {
                System.out.println("Renter with this id already exists");
                return;
            }
        }

        // Adding in the types
        if (RenterType.equals("RegularRenter")) {
            addRegularRenter(Renter_id, Renter_name, Renter_Email, Renter_contactnumber, Renter_address, RenterType);
        } else if (RenterType.equals("FrequentRenter")) {
            AddFrequentRenter(Renter_id, Renter_name, Renter_Email, Renter_contactnumber, Renter_address, RenterType);
        } else if (RenterType.equals("CorporateRenter")) {
            addCorporateRenter(Renter_id, Renter_name, Renter_Email, Renter_contactnumber, Renter_address, RenterType);
        } else {
            System.out.println("The type you entered is not valid please add the rented again");
        }
    }

    private void AddFrequentRenter(int Renter_id, String Renter_name, String Renter_Email, String Renter_contactnumber,
            String Renter_address, String RenterType) {
        Frequentrenter
                .add(new FrequentRenter(Renter_id, Renter_name, Renter_Email, Renter_contactnumber, Renter_address,
                        RenterType));
    }

    private void addCorporateRenter(int Renter_id, String Renter_name, String Renter_Email, String Renter_contactnumber,
            String Renter_address, String RenterType) {
        CorporateRenters
                .add(new CorporateRenter(Renter_id, Renter_name, Renter_Email, Renter_contactnumber, Renter_address,
                        RenterType));
    }

    private void addRegularRenter(int Renter_id, String Renter_name, String Renter_Email, String Renter_contactnumber,
            String Renter_address, String RenterType) {
        RegularRenters
                .add(new RegularRenter(Renter_id, Renter_name, Renter_Email, Renter_contactnumber, Renter_address,
                        RenterType));
        System.out.println("The renter is added");
    }

    // the function to Display the details of a Renter

    public void Display(int id) {

        System.out.println("-------------------------------------");
        for (int i = 0; i < RegularRenters.size(); i++) {

            if (RegularRenters.get(i).getRenter_id() == id) {
                System.out.println("The Renter id is: " + RegularRenters.get(i).getRenter_id());
                System.out.println("The Renter name is: " + RegularRenters.get(i).getRenter_name());
                System.out.println("The Renter Email is: " + RegularRenters.get(i).getRenter_Email());
                System.out.println(
                        "The Renter contact number is: " + RegularRenters.get(i).getRenter_contactnumber());
                System.out.println("The Renter address is: " + RegularRenters.get(i).getRenter_address());
                return;
            }
        }
        System.out.println("-------------------------------------");
        for (int i = 0; i < CorporateRenters.size(); i++) {

            if (CorporateRenters.get(i).getRenter_id() == id) {
                System.out.println("The Renter id is: " + CorporateRenters.get(i).getRenter_id());
                System.out.println("The Renter name is: " + CorporateRenters.get(i).getRenter_name());
                System.out.println("The Renter Email is: " + CorporateRenters.get(i).getRenter_Email());
                System.out.println(
                        "The Renter contact number is: " + CorporateRenters.get(i).getRenter_contactnumber());
                System.out.println("The Renter address is: " + CorporateRenters.get(i).getRenter_address());
                return;
            }
        }
        for (int i = 0; i < Frequentrenter.size(); i++) {
            if (Frequentrenter.get(i).getRenter_id() == id) {
                System.out.println("The Renter id is: " + Frequentrenter.get(i).getRenter_id());
                System.out.println("The Renter name is: " + Frequentrenter.get(i).getRenter_name());
                System.out.println("The Renter Email is: " + Frequentrenter.get(i).getRenter_Email());
                System.out.println(
                        "The Renter contact number is: " + Frequentrenter.get(i).getRenter_contactnumber());
                System.out.println("The Renter address is: " + Frequentrenter.get(i).getRenter_address());
                return;
            }
        }
        System.out.println("Renter with this id does not exist");
        System.out.println("-------------------------------------");
    }

    // function to remove a Renter
    void removeRenter(int id) {
        for (int i = 0; i < RegularRenters.size(); i++) {
            if (RegularRenters.get(i).getRenter_id() == id) {
                RegularRenters.remove(i);
                System.out.println("the renter has been removed");
                return;
            }
        }
        for (int i = 0; i < CorporateRenters.size(); i++) {
            if (CorporateRenters.get(i).getRenter_id() == id) {
                CorporateRenters.remove(i);
                System.out.println("the renter has been removed");
                return;
            }
        }
        for (int i = 0; i < Frequentrenter.size(); i++) {
            if (Frequentrenter.get(i).getRenter_id() == id) {
                Frequentrenter.remove(i);
                System.out.println("the renter has been removed");
                return;
            }
        }
    }

    // to find renter in the list by its id
    public Renter findRenterById(int renterId) {
        for (RegularRenter regularRenter : RegularRenters) {
            if (regularRenter.getRenter_id() == renterId) {
                return regularRenter;
            }
        }
        for (CorporateRenter corporateRenter : CorporateRenters) {
            if (corporateRenter.getRenter_id() == renterId) {
                return corporateRenter;
            }
        }
        for (FrequentRenter frequentRenter : Frequentrenter) {
            if (frequentRenter.getRenter_id() == renterId) {
                return frequentRenter;
            }
        }
        return null;
    }

    @Override
    public void Display() {
        // TODO Auto-generated method stub

    }

}
