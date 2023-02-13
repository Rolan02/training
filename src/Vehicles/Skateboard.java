package Vehicles;

import accessories.Color;
import accessories.Model;
import accessories.Passenger;
import funcionality.IVehicleSice;

public class Skateboard extends VehicleSice implements IVehicleSice {

    public Skateboard(String name, Color color, Model model, int price, int sice, Passenger pasajer) {
        super(name, color, model, price, sice, pasajer);
    }

    @Override
        public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel().getName() + "\nColor: " + getColor().getName() +
                "\nTamaño: " + getSice()+ "\nPasajero: " + getPasajer().getQuantity() + "\n";
        }

}




