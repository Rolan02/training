import java.util.List;

public class Bycicle {
    private String name;
    private String color;
    private int model;
    private int price;

    public Bycicle(String name, String color, int model, int price) {
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

    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel() + "\nColor: " + getColor() + "\n";
    }

    public static void findByModel(List<Bycicle> bycycles, int model) {
        bycycles.stream().filter(car -> car.getModel() == model).forEach(System.out::println);
    }
  
    public static void findByPrice(List<Bycicle> bycycles, int price) {
        bycycles.stream().filter(car -> car.getPrice() == price).forEach(System.out::println);
    }
}
