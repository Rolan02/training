package Vehicles;

import accessories.Color;
import accessories.Model;
import funcionality.IVehicleCapacity;

public class Balloon extends VehicleCapacity implements IVehicleCapacity {


    public Balloon(String name, Color color, Model model, int price, int pasajer, int capacity) {
        super(name, color, model, price, pasajer, capacity);
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel().getName() + "\nColor: " + getColor().getName() + "\nPasajero: " + getPasajer() + "\nCapacidad: " + getCapacity() + "\n";
    }
}
