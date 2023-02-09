package Vehicles;


import accessories.Color;
import accessories.Engine;
import funcionality.IVehicle;
import funcionality.IVehicleMotor;

public class Car extends VehicleMotor implements IVehicle, IVehicleMotor {
    public Car(String name, Color color, int model, int price, Engine engine, int pasajer) {
        super(name, color, model, price, engine, pasajer);
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel() + "\n Color: " + getColor().getName() +
                "\nMotor: " + getEngine().getName()+ "\nPasajero: " + getPasajer() + "\n";
    }
}
