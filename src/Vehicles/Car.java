package Vehicles;

import funcionality.IVehicle;
import funcionality.IVehicleMotor;

public class Car extends VehicleMotor implements IVehicle, IVehicleMotor {
    public Car(String name, String color, int model, int price, String engine, int pasajer) {
        super(name, color, model, price, engine, pasajer);
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel() + "\naccessories.Color: " + getColor() +
                "\nMotor: " + getEngine()+ "\nPasajero: " + getPasajer() + "\n";
    }
}
