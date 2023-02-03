package Vehicles;

import funcionality.IVehicle;

public class Bycicle extends Vehicle implements IVehicle {

    public Bycicle(String name, String color, int model, int price, int pasajer) {
        super(name, color, model, price, pasajer);
    }
    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel() + "\naccessories.Color: " + getColor() +
                "\nPasajero: " + getPasajer() + "\n";
    }
}
