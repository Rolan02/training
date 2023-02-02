public class VehicleAro extends VehicleSice {
    private int aro;

    public VehicleAro(String name, String color, int model, int price, int sice, int pasajer, int llanta, int aro, int aro1) {
        super(name, color, model, price, sice, pasajer, llanta, aro);
        this.aro = aro1;
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nModelo: " + getModel() + "\nColor: " + getColor() +
                "\nTamaño: " + getSice() + "\nPasajero: " + getPasajer() + "\nLlanta: " + getLlanta() + "Aro: " + getAro() + "\n";
    }

    @Override
    public int getAro() {return aro;}
}
