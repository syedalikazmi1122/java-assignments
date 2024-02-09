public class LuxuryCar extends Car{
    
   LuxuryCar(int  Car_id, String Brand, String Model, String PlateNumber) 
   {
        super(Car_id, "Luxurycar", Brand, Model, false, PlateNumber, true, 50000 );
    }
    
    public void getFeatures() {
        System.out.println("Luxury car has 4 seats and 4 doors \n suitable for long-distance travel.");
   }
}
