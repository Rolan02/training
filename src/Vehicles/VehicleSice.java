package Vehicles;

import accessories.Color;
import accessories.Model;

public class VehicleSice extends Vehicle {
    private int sice;

    public VehicleSice(String name, Color color, Model model, int price, int sice, int pasajer) {
        super(name, color, model, price, pasajer);
        this.sice = sice;
    }

    public int getSice() {return sice;}
}