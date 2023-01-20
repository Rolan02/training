import java.util.List;

public class Bycicle extends Vehicle implements IVehicle {

    public Bycicle(String name, String color, int model, int price) {
        super(name, color, model, price);
    }
    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel() + "\nColor: " + getColor() + "\n";
    }
}
