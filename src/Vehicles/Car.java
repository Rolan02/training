package Vehicles;


import accessories.Color;
import accessories.Model;
import funcionality.IVehicle;
import funcionality.IVehicleMotor;

public class Car extends VehicleMotor implements IVehicle, IVehicleMotor {
    public Car(String name, Color color, Model model, int price, String engine, int pasajer) {
        super(name, color, model, price, engine, pasajer);
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel().getName() + "\nColor: " + getColor().getName() +
                "\nMotor: " + getEngine()+ "\nPasajero: " + getPasajer() + "\n";
    }
}
