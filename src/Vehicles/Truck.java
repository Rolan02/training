package Vehicles;

import accessories.Color;
import accessories.Model;
import funcionality.IVehicle;
import funcionality.IVehicleMotor;

public class Truck extends VehicleMotor implements IVehicle, IVehicleMotor {
    private int quantity;

    public Truck(String name, Color color, Model model, int price, String engine, int pasajer, int quantity) {
        super(name, color, model, price, engine, pasajer);
        this.quantity = quantity;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel().getName() + "\nColor: " + getColor().getName() +
                "\nMotor: " + getEngine()+ "\nPasajero: " + getPasajer() + "\nTonelaje: "+ getQuantity() + "\n";
    }

    public int getQuantity() {
        return quantity;
    }
}
