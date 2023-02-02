public class Skateboard extends VehicleSice implements IVehicleSice {

    public Skateboard(String name, String color, int model, int price, int sice, int pasajer, int llanta, int aro) {
        super(name, color, model, price, sice, pasajer, llanta, aro);
    }

    @Override
        public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel() + "\nColor: " + getColor() +
                "\nTamaño: " + getSice()+ "\nPasajero: " + getPasajer() + "\nLlanta: " + getLlanta() + "\n";
        }

}




