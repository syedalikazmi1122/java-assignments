public  class FrequentRenter extends Renter{
    
        FrequentRenter(int Renter_id, String Renter_name, String Renter_Email, String Renter_contactnumber,
                String Renter_address) {
            super(Renter_id, Renter_name, Renter_Email, Renter_contactnumber, Renter_address);
        }

        public void viewfeatures() {
            System.out.println(
                    "Standard Rent  Rates  set by the company are applied on this type : \n 5000 for compact cars \n 10000 for SUV cars \n 35000 for Luxury cars ");
        }
    
}