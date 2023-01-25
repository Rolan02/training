public class VehicleSice extends Vehicle {
    private int sice;

    public VehicleSice(String name, String color, int model, int price, int sice) {
        super(name, color, model, price);
        this.sice = sice;
    }

    public int getSice() {
        return sice;
    }
}