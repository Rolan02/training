public class Motocycle extends VehicleMotor implements IVehicle, IVehicleMotor {

    public Motocycle(String name, String color, int model, int price, String engine, int placa) {
        super(name, color, model, price, engine, placa);
    }
    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel() + "\nColor: " + getColor() + "\nMotor: " + getEngine()+ "\n";
    }
}
