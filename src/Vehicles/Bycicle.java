package Vehicles;

import accessories.Color;
import funcionality.IVehicle;

public class Bycicle extends Vehicle implements IVehicle {

    public Bycicle(String name, Color color, int model, int price, int pasajer) {
        super(name, color, model, price, pasajer);
    }
    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel() + "\n Color: " + getColor().getName() +
                "\nPasajero: " + getPasajer() + "\n";
    }
}
