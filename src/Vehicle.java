public class Vehicle {
    private String name;
    private String color;
    private int model;
    private int price;
    private int pasajer;
    private int llanta;
    private int aro;
    public Vehicle(String name, String color, int model, int price, int pasajer, int llanta, int aro) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.price = price;
        this.pasajer = pasajer;
        this.llanta = llanta;
        this.aro = aro;
    }
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
    public int getPasajer() {return pasajer;}
    public int getLlanta() {return llanta;}
    public int getAro(){return aro;}
}
