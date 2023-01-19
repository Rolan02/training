import java.util.List;

public class Motocycle {
    private String name;
    private String color;
    private String engine;
    private int model;
    private int placa;
    private int price;

    public Motocycle(String name, String color, String engine, int model, int placa, int price) {
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

    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel() + "\nColor: " + getColor() + "\nMotor: " + getEngine()+ "\n";
    }
    public static void findByModel(List<Motocycle> motocycles, int model) {
        motocycles.stream().filter(car -> car.getModel() == model).forEach(System.out::println);
    }
    public static void findByPrice(List<Motocycle> motocycles, int price) {
        motocycles.stream().filter(car -> car.getPrice() == price).forEach(System.out::println);
    }
    public static void findByEngine(List<Motocycle> motocycles, String var) {
        motocycles.stream().filter(car -> car.getEngine().equals(var)).forEach(System.out::println);
    }
}
