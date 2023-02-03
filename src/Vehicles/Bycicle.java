package Vehicles;

import funcionality.IVehicle;

public class Bycicle extends Vehicle implements IVehicle {

    public Bycicle(String name, String color, int model, int price, int pasajer, int llanta, int aro) {
        super(name, color, model, price, pasajer, llanta, aro);
    }
    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel() + "\naccessories.Color: " + getColor() +
                "\nPasajero: " + getPasajer() + "\nLlanta: " + getLlanta() + "\naccessories.Aro: " + getAro() + "\n";
    }
}
