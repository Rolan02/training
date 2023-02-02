public class Truck extends VehicleMotor implements IVehicle, IVehicleMotor{
    private int quantity;

    public Truck(String name, String color, int model, int price, String engine, int pasajer, int quantity,int llanta, int aro) {
        super(name, color, model, price, engine, pasajer, llanta, aro);
        this.quantity = quantity;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel() + "\nColor: " + getColor() +
                "\nMotor: " + getEngine()+ "\nPasajero: " + getPasajer() + "\nTonelaje: "+ getQuantity() +"\nLlanta: " + getLlanta() + "\nAro: " + getAro() + "\n";
    }

    public int getQuantity() {
        return quantity;
    }
}
