package Vehicles;

import accessories.Color;
import accessories.Model;

public class VehicleCapacity extends Vehicle {
    private int capacity;

    public VehicleCapacity(String name, Color color, Model model, int price, int pasajer, int capacity) {
        super(name, color, model, price, pasajer);
        this.capacity = capacity;
    }

    public int getCapacity() {return capacity;}
}

