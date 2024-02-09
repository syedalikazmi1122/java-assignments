public class SUVCars extends Car{
    SUVCars(int Car_id, String Brand, String Model, String PlateNumber) 
    {
        super(Car_id, "SUVcar", Brand, Model, false, PlateNumber, true, 30000 );
    }

    public void getFeatures() {
        System.out.println("SUV car has 5 seats and 4 doors \n suitable for long-distance travel.");
    }
}
