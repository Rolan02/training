package Vehicles;

import accessories.Color;
import funcionality.IVehicle;
import funcionality.IVehicleMotor;

public class Truck extends VehicleMotor implements IVehicle, IVehicleMotor {
    private int quantity;

    public Truck(String name, Color color, int model, int price, String engine, int pasajer, int quantity) {
        super(name, color, model, price, engine, pasajer);
        this.quantity = quantity;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel() + "\n Color: " + getColor().getName() +
                "\nMotor: " + getEngine()+ "\nPasajero: " + getPasajer() + "\nTonelaje: "+ getQuantity() + "\n";
    }

    public int getQuantity() {
        return quantity;
    }
}
