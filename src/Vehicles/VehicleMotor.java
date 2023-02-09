package Vehicles;

import accessories.Color;
import accessories.Engine;

public class VehicleMotor extends Vehicle {
    private Engine engine;

    public VehicleMotor(String name, Color color, int model, int price, Engine engine, int pasajer) {
        super(name, color, model, price,pasajer);
        this.engine = engine;
    }
    public Engine getEngine() {
        return engine;
    }

}
