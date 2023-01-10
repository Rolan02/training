public class Main {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota",2000,"Blanco","v8",1599, 15000);
        Car mitsubishi = new Car("mitsubishi",2010,"Negro","v6",1598, 20000);
        Car mazda = new Car("mazda",2020,"ROjo","v6",8598,25000);

        User juan = new User("Juan Perez",22000, 9501064);
        User pedrito = new User("Pedrito Perez",100000, 9505064);
        User roberto = new User("Roberto Perez",16000, 9501964);

        Car.imprimirDetalles(toyota);
        Car.imprimirDetalles(mitsubishi);
        Car.imprimirDetalles(mazda);
    }
}