public class VehicleSice extends Vehicle {
    private int sice;

    public VehicleSice(String name, String color, int model, int price, int sice, int pasajer) {
        super(name, color, model, price, pasajer);
        this.sice = sice;
    }

    public int getSice() {return sice;}
}