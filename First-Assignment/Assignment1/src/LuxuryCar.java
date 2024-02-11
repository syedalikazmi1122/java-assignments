
//syed ali kazmi 
//22i-2472
//se-b
public class LuxuryCar extends Car {
    private static double baseammount = 50000;

    LuxuryCar(int Car_id, String Brand, String Model, String PlateNumber) {
        super(Car_id, "Luxurycar", Brand, Model, false, PlateNumber, true, baseammount);
    }

    public void getFeatures() {
        System.out.println("Luxury car has 4 seats and 4 doors \n suitable for long-distance travel.");
    }
}
