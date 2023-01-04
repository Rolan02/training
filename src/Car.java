public class Car {

    //Propiedas de la clase
    private String name;
    private String color;
    private String engine;
    private int model;
    private int placa;

    //Metodo constructor
    public Car(String name, int model,String color,String engine, int placa) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.placa = placa;
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

    //Metodo para imprimir las propiedades del auto
    public static void imprimirDetalles(Car aux) {
        System.out.println("================");
        System.out.println("El auto es : " + aux.getName());
        System.out.println("Su modelo es : " + aux.getModel());
        System.out.println("Su color  es : " + aux.getColor() );
        System.out.println("Tipo de Motor : " + aux.getEngine() );
        System.out.println("Con el numero de placa : " + aux.getPlaca());
        System.out.println("================");
    }
}
