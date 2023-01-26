import java.util.List;

public class Bycicle extends Vehicle implements IVehicle {

    public Bycicle(String name, String color, int model, int price, int pasajer) {
        super(name, color, model, price, pasajer);
    }
    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel() + "\nColor: " + getColor() + "\nPasajero: " + getPasajer() + "\n";
    }
}
