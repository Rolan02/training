package Vehicles;
public class Airplane extends VehicleCapacity implements IVehicleCapacity {

    public Airplane(String name, String color, int model, int price, int pasajer, int capacity) {
        super(name, color, model, price, pasajer, capacity);
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel() + "\naccessories.Color: " + getColor() +
                "\nPasajero: " + getPasajer() + "\nCapacidad: " + getCapacity()  + "\n";
    }
}
