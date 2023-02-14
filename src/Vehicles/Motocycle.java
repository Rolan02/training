package Vehicles;

import accessories.Color;
import accessories.Engine;
import accessories.Model;
import funcionality.IVehicle;
import funcionality.IVehicleMotor;

public class Motocycle extends VehicleMotor implements IVehicle, IVehicleMotor {
    public Motocycle(String name, Color color, Model model, int price, Engine engine, int pasajer) {
        super(name, color, model, price, engine, pasajer);
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel().getName() + "\nColor: " + getColor().getName() +
                "\nMotor: " + getEngine().getName()+ "\nPasajero: " + getPasajer() + "\n";
    }
}
