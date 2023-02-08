package accessories;

public class Color {
    private String name;
    private int price;

    public Color(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Color() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
