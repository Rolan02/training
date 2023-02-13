package Vehicles;

import accessories.Color;
import accessories.Model;
import accessories.Passenger;
import funcionality.IVehicleCapacity;

public class Airplane extends VehicleCapacity implements IVehicleCapacity {

    public Airplane(String name, Color color, Model model, int price, Passenger pasajer, int capacity) {
        super(name, color, model, price, pasajer, capacity);
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel().getName() + "\nColor: " + getColor().getName() +
                "\nPasajero: " + getPasajer().getQuantity() + "\nCapacidad: " + getCapacity()  + "\n";
    }
}
