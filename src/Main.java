public class Main {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota",2000,"Blanco","v8",1599);
        Car mitsubishi = new Car("mitsubishi",2010,"Negro","v6",1598);
        Car mazda = new Car("mazda",2020,"ROjo","v6",8598);

        Car.imprimirDetalles(toyota);
        Car.imprimirDetalles(mitsubishi);
        Car.imprimirDetalles(mazda);
    }
}