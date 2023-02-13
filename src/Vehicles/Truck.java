package Vehicles;

import accessories.Color;
import accessories.Engine;
import accessories.Model;
import accessories.Passenger;
import funcionality.IVehicle;
import funcionality.IVehicleMotor;

public class Truck extends VehicleMotor implements IVehicle, IVehicleMotor {
    private int quantity;

    public Truck(String name, Color color, Model model, int price, Engine engine, Passenger pasajer, int quantity) {
        super(name, color, model, price, engine, pasajer);
        this.quantity = quantity;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel().getName() + "\nColor: " + getColor().getName() +
                "\nMotor: " + getEngine().getName()+ "\nPasajero: " + getPasajer().getQuantity() + "\nTonelaje: "+ getQuantity() + "\n";
    }

    public int getQuantity() {
        return quantity;
    }
}
