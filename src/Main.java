import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Car toyota = new Car("Toyota",2000,"blanco","v8",1599, 15000);
        Car mitsubishi = new Car("mitsubishi",2010,"negro","v6",1598, 20000);
        Car mazda = new Car("mazda",2020,"rojo","v5",8598,25000);
        Car BMW = new Car("BMW",2020,"amarillo","v10",1587, 40000);
        Car mercedes_benz = new Car("Mercedes_benz",2005,"celeste","v7",1369, 35000);
        Car chevrolet = new Car("chevrolet",2023,"verde","v9",7825,30000);

        List<Car> cars = new ArrayList<Car>();
        cars.add(toyota);
        cars.add(mitsubishi);
        cars.add(mazda);
        cars.add(BMW);
        cars.add(mercedes_benz);
        cars.add(chevrolet);

        //Scanner nos sirve para recuperar datos ingresados desde el teclado del usuario
        Scanner sn = new Scanner(System.in);
        Scanner read = new Scanner(System.in);

        boolean exit = false;
        int option;

        while(!exit) {
            System.out.println("===== Buscador de Vehiculos =====");
            System.out.println("1.- Buscar por precio");
            System.out.println("2.- Buscar por modelo");
            System.out.println("3.- Buscar por motor");
            System.out.println("4.- Buscar por color");
            System.out.println("5.- Salir");

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
                        int model;
                        model = sn.nextInt();
                        System.out.println("========== Vehiculos disponibles por Modelo ========");
                        Car.findByModel(cars,model);
                        System.out.println("===========================================================");
                        break;
                    case 3:
                        System.out.println("Buscando por motor.....");
                        String engine = read.next();
                        String var = engine.toLowerCase();
                        System.out.println("========== Vehiculos disponibles por Motor ========");
                        Car.findByEngine(cars,var);
                        System.out.println("===========================================================");
                        break;
                    case 4:
                        System.out.println("========== Vehiculos disponibles por Color ========");
                        String color = read.next();
                        String col = color.toLowerCase();
                        System.out.println("Buscando por color........");
                        Car.findByColor(cars,col);
                        System.out.println("===========================================================");
                        break;
                    case 5:
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