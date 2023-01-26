public class VehicleMotor extends Vehicle {
    private String engine;
    private int placa;

    public VehicleMotor(String name, String color, int model, int price, String engine, int placa, int pasajer) {
        super(name, color, model, price,pasajer);
        this.engine = engine;
        this.placa = placa;
    }
    public String getEngine() {
        return engine;
    }
    public int getPlaca() {
        return placa;
    }
}
