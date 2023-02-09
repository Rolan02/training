package Vehicles;

import accessories.Color;
import funcionality.IVehicleCapacity;

public class Airplane extends VehicleCapacity implements IVehicleCapacity {

    public Airplane(String name, Color color, int model, int price, int pasajer, int capacity) {
        super(name, color, model, price, pasajer, capacity);
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel() + "\nColor: " + getColor().getName() +
                "\nPasajero: " + getPasajer() + "\nCapacidad: " + getCapacity()  + "\n";
    }
}
