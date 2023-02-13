package Vehicles;


import accessories.Color;
import accessories.Engine;
import accessories.Model;
import accessories.Passenger;
import funcionality.IVehicle;
import funcionality.IVehicleMotor;

public class Car extends VehicleMotor implements IVehicle, IVehicleMotor {
    public Car(String name, Color color, Model model, int price, Engine engine, Passenger pasajer) {
        super(name, color, model, price, engine, pasajer);
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel().getName() + "\nColor: " + getColor().getName() +
                "\nMotor: " + getEngine().getName()+ "\nPasajero: " + getPasajer().getQuantity() + "\n";
    }
}
