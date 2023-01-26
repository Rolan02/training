public class Vehicle {
    private String name;
    private String color;
    private int model;
    private int price;
    public Vehicle(String name, String color, int model, int price) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
}
