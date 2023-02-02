import java.util.List;

public class Bycicle extends Vehicle implements IVehicle {

    public Bycicle(String name, String color, int model, int price, int pasajer, int llanta, int aro) {
        super(name, color, model, price, pasajer, llanta, aro);
    }
    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel() + "\nColor: " + getColor() +
                "\nPasajero: " + getPasajer() + "\nLlanta: " + getLlanta() + "\nAro: " + getAro() + "\n";
    }
}
