public class Balloon extends VehicleCapacity implements IVehicleCapacity {


    public Balloon(String name, String color, int model, int price, int pasajer, int capacity) {
        super(name, color, model, price, pasajer, capacity);
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel() + "\nColor: " + getColor() +
                "\nPasajero: " + getPasajer() + "\nCapacidad: " + getCapacity() + "\n";
    }
}
