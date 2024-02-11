

//syed ali kazmi 
//22i-2472
//se-b
public class Compactcar extends Car {
    public Compactcar(int Car_id, String Brand, String Model, String PlateNumber) {
        super(Car_id, "Compactcar", Brand, Model, false, PlateNumber, false, 15000);
    }

    public void getFeatures() {
        System.out.println("Compact car has 4 seats and 2 doorsv \n suitable for short-distance travel.");
    }
}
