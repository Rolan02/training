public class Motocycle extends VehicleMotor implements IVehicle, IVehicleMotor {
    public Motocycle(String name, String color, int model, int price, String engine, int pasajer, int llanta, int aro) {
        super(name, color, model, price, engine, pasajer, llanta,aro);
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel() + "\nColor: " + getColor() +
                "\nMotor: " + getEngine()+ "\nPasajero: " + getPasajer() + "\nLlanta: " + getLlanta() + "\nAro: " + getAro() + "\n";
    }
}
