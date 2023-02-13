package Vehicles;

import accessories.Color;
import accessories.Model;

public class Vehicle {
    private String name;
    private Color color;
    private Model model;
    private int price;
    private int pasajer;

    public Vehicle(String name, Color color, Model model, int price, int pasajer) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.price = price;
        this.pasajer = pasajer;
    }
    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public Model getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
    public int getPasajer() {return pasajer;}
}
