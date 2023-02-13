package Vehicles;

import accessories.Color;
import accessories.Model;
import accessories.Passenger;
import funcionality.IVehicle;

public class Bycicle extends Vehicle implements IVehicle {

    public Bycicle(String name, Color color, Model model, int price, Passenger pasajer) {
        super(name, color, model, price, pasajer);
    }
    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel().getName() + "\nColor: " + getColor().getName() +
                "\nPasajero: " + getPasajer().getQuantity() + "\n";
    }
}
