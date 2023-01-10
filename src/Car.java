public class Car {

    //Propiedas de la clase
    private String name;
    private String color;
    private String engine;
    private int model;
    private int placa;
    private int price;

    //Metodo constructor
    public Car(String name, int model,String color,String engine, int placa, int price) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.placa = placa;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public int getModel() {
        return model;
    }

    public int getPlaca() {
        return placa;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    //Metodo para imprimir las propiedades del auto
    public static void imprimirDetalles(Car aux) {
        System.out.println("================");
        System.out.println("El auto es : " + aux.getName());
        System.out.println("Su modelo es : " + aux.getModel());
        System.out.println("Su color  es : " + aux.getColor() );
        System.out.println("Tipo de Motor : " + aux.getEngine() );
        System.out.println("Con el numero de placa : " + aux.getPlaca());
        System.out.println("Su precio es : " + aux.getPrice());
        System.out.println("================");
    }
}
