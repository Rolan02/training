public class Balloon extends VehicleCapacity implements IVehicleCapacity {


    public Balloon(String name, String color, int model, int price, int pasajer, int capacity, int llanta,int aro) {
        super(name, color, model, price, pasajer, capacity, llanta, aro);
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel() + "\nColor: " + getColor() + "\nPasajero: " + getPasajer() + "\nCapacidad: " + getCapacity() + "\n";
    }
}
