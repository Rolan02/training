package Vehicles;

import accessories.Color;
import accessories.Engine;
import accessories.Model;
import accessories.Passenger;

public class VehicleMotor extends Vehicle {
    private Engine engine;

    public VehicleMotor(String name, Color color, Model model, int price, Engine engine, Passenger pasajer) {
        super(name, color, model, price,pasajer);
        this.engine = engine;
    }
    public Engine getEngine() {
        return engine;
    }

}
