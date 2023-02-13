package Vehicles;
import accessories.Color;
import accessories.Model;
import accessories.Passenger;

public class VehicleSice extends Vehicle {
    private int sice;

    public VehicleSice(String name, Color color, Model model, int price, int sice, Passenger pasajer) {
        super(name, color, model, price, pasajer);
        this.sice = sice;
    }

    public int getSice() {return sice;}
}