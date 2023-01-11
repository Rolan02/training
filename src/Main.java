import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Car toyota = new Car("Toyota",2000,"Blanco","v8",1599, 15000);
        Car mitsubishi = new Car("mitsubishi",2010,"Negro","v6",1598, 20000);
        Car mazda = new Car("mazda",2020,"ROjo","v6",8598,25000);

        List<Car> cars = new ArrayList<Car>();
        cars.add(toyota);
        cars.add(mitsubishi);

        //Scanner nos sirve para recuperar datos ingresados desde el teclado del usuario
        Scanner sn = new Scanner(System.in);

        boolean exit = false;
        int option;

        while(!exit) {
            System.out.println("===== Buscador de Vehiculos =====");
            System.out.println("1.- Buscar por precio");
            System.out.println("2.- Buscar por modelo");
            System.out.println("3.- Buscar por motor");
            System.out.println("4.- Salir");

            try {
                System.out.println("Escribe una de las opciones");
                option = sn.nextInt();
                switch (option) {
                    case 1:
                        Scanner price = new Scanner(System.in);
                        System.out.println("Ingrese su Precio maximo....");
                        int amount;
                        amount = sn.nextInt();
                        System.out.println("========== Vehiculos disponibles para su presupuesto ========");
                        Car.findByPrice(cars,amount);
                        System.out.println("===========================================================");
                        break;
                    case 2:
                        System.out.println("Buscando por modelo........");
                        break;
                    case 3:
                        System.out.println("Buscando por motor........");
                        break;
                    case 4:
                        exit = true;
                        break;
                    default:
                        System.out.println("Solo opciones de 1 a 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Opcion incorrecta ingresa un numero");
                sn.next();
            }
        }
    }
}