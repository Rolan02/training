public class VehicleMotor extends Vehicle {
    private String engine;

    public VehicleMotor(String name, String color, int model, int price, String engine, int pasajer) {
        super(name, color, model, price,pasajer);
        this.engine = engine;
    }
    public String getEngine() {
        return engine;
    }

}
