import java.util.List;

public class Skateboard extends VehicleSice implements IVehicleSice {

    public Skateboard(String name, String color, int model, int price, int sice) {
        super(name, color, model, price, sice);
    }

    @Override
        public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel() + "\nColor: " + getColor() + "\nTamaño: " + getSice()+ "\n";
        }
}



