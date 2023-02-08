package Vehicles;

import accessories.Color;

public class Vehicle {
    private String name;
    private Color color;
    private int model;
    private int price;
    private int pasajer;

    public Vehicle(String name, Color color, int model, int price, int pasajer) {
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

    public int getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
    public int getPasajer() {return pasajer;}
}
