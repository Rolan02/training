import java.util.*;
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

    // Formato para imprimir los objetos de Car
    @Override
    public String toString() {
        return "\nNombre: " + getName() + "\nModelo: " + getModel() + "\nColor: " + getColor() + "\nMotor: " + getEngine();
    }

    // Metodo que filtra los autos segun el precio ingresado por el usuario
    public static void findByPrice(List<Car> cars, int price){
        cars.stream().filter(car -> car.getPrice() <= price).forEach(System.out::println);
    }
    //metodo que filtra los autos segun su modelo
    public static void findByModel(List<Car> year, int model){
        year.stream().filter(car -> car.getModel() >= model). forEach(System.out::println);
    }
    //metodo que filtra por numero de motor
    public static void findByEngine(Car car){
        System.out.println("======================");
        System.out.println("El Auto : " + car.getName());
        System.out.println("motor : " + car.getEngine());
        System.out.println("======================");
    }
    public static void findByColor(Car colors){
        System.out.println("======================");
        System.out.println("El Auto : " + colors.getName());
        System.out.println("color : " + colors.getColor());
        System.out.println("======================");
    }
}
