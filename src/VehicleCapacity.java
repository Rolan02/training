public class VehicleCapacity extends Vehicle {
    private int capacity;

    public VehicleCapacity(String name, String color, int model, int price, int pasajer, int capacity, int llanta, int aro) {
        super(name, color, model, price, pasajer,llanta, aro);
        this.capacity = capacity;
    }

    public int getCapacity() {return capacity;}
}

