package Vehicles;

import accessories.Color;
import accessories.Engine;
import accessories.Model;

public class VehicleMotor extends Vehicle {
    private Engine engine;

    public VehicleMotor(String name, Color color, Model model, int price, Engine engine, int pasajer) {
        super(name, color, model, price,pasajer);
        this.engine = engine;
    }
    public Engine getEngine() {
        return engine;
    }

}
