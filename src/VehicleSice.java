public class VehicleSice extends Vehicle {
    private int sice;

    public VehicleSice(String name, String color, int model, int price, int sice, int pasajer, int llanta, int aro) {
        super(name, color, model, price, pasajer,llanta, aro);
        this.sice = sice;
    }

    public int getSice() {
        return sice;
    }
}