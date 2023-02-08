package Vehicles;

import accessories.Color;
import funcionality.IVehicleSice;

public class Skateboard extends VehicleSice implements IVehicleSice {

    public Skateboard(String name, Color color, int model, int price, int sice, int pasajer) {
        super(name, color, model, price, sice, pasajer);
    }

    @Override
        public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel() + "\n Color: " + getColor().getName() +
                "\nTamaño: " + getSice()+ "\nPasajero: " + getPasajer() + "\n";
        }

}




