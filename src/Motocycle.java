public class Motorcycle {
    private String name;
    private String color;
    private String engine;
    private int model;
    private int placa;
    private int price;

    public Motorcycle(String name, String color, String engine, int model, int placa, int price) {
        this.name = name;
        this.color = color;
        this.engine = engine;
        this.model = model;
        this.placa = placa;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public int getModel() {
        return model;
    }

    public int getPlaca() {
        return placa;
    }

    public int getPrice() {
        return price;
    }
}
