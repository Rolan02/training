import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Vehicle toyota = new Car("Toyota","blanco",2010,25000,"v6", 1241);
        Vehicle mazda = new Car("Mazda","gris",2015,15000,"v6", 1241);
        Vehicle mitsubishi = new Car("mitsubishi","amarillo",2020,35000,"v6", 1241);
        Vehicle bmw = new Car("bmw","blanco",2015,25000,"v8", 1241);
        Vehicle mercedesBenz = new Car("mercedesBenz","verde",2020,18000,"v8", 1241);

        Vehicle venzo = new Bycicle("venzo","blanco",2010,2000);
        Vehicle venzito = new Bycicle("venzito","negro",2015,1200);
        Vehicle veloshe = new Bycicle("veloshe","amarillo",2018,2500);
        Vehicle sport = new Bycicle("sport","gris",2020,3500);
        Vehicle argon = new Bycicle("argon","verde",2005,3000);

        Vehicle pegasus = new Motocycle("pegasus","verde",2010,1800,"v6", 1241);
        Vehicle suzuki = new Motocycle("suzuki","amarillo",2015,11000,"v8", 1241);
        Vehicle junior = new Motocycle("junior","verde",2020,1900,"v6", 1241);
        Vehicle pong = new Motocycle("pong","negro",2022,1600,"v8", 1241);
        Vehicle dior = new Motocycle("dior","blanco",2005,1200,"v6", 1241);

        List<Vehicle> cars = new ArrayList<>();
        cars.add(toyota);
        cars.add(mitsubishi);
        cars.add(mazda);
        cars.add(bmw);
        cars.add(mercedesBenz);

        List<Vehicle> bycicles =  new ArrayList<>();
        bycicles.add(venzo);
        bycicles.add(venzito);
        bycicles.add(veloshe);
        bycicles.add(sport);
        bycicles.add(argon);

        List<Vehicle> motocycles =  new ArrayList<>();
        motocycles.add(pegasus);
        motocycles.add(suzuki);
        motocycles.add(junior);
        motocycles.add(pong);
        motocycles.add(dior);

        IVehicle vehicle = new IVehicle() {};
        IVehicleMotor vehicleMotor = new IVehicleMotor() {};

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
                        System.out.println("Ingrese su Precio estimado");
                        int amount;
                        amount = sn.nextInt();
                        System.out.println("========== Vehiculos disponibles para su presupuesto ========");
                        vehicle.findByPrice(cars,amount);
                        System.out.println("========== Motos disponibles para su presupuesto ========");
                        vehicle.findByPrice(motocycles,amount);
                        System.out.println("========== Bicicletas disponibles para su presupuesto ========");
                        vehicle.findByPrice(bycicles,amount);
                        System.out.println("===========================================================");
                        break;
                    case 2:
                        System.out.println("Buscando por modelo........");
                        int model;
                        model = sn.nextInt();
                        System.out.println("========== Autos disponibles por Modelo ========");
                        vehicle.findByModel(cars,model);
                        System.out.println("========== Motos disponibles por Modelo ========");
                        vehicle.findByModel(motocycles,model);
                        System.out.println("========== Bicicletas disponibles por Modelo ========");
                        vehicle.findByModel(bycicles,model);
                        System.out.println("===========================================================");
                        break;
                    case 3:
                        System.out.println("Buscando por motor.....");
                        String engine = read.next();
                        String var = engine.toLowerCase();
                        System.out.println("========== Autos disponibles por Motor ========");
                        vehicleMotor.findByEngine(cars,var);
                        System.out.println("========== Motos disponibles por Motor ========");
                        vehicleMotor.findByEngine(motocycles,var);
                        System.out.println("===========================================================");
                        break;
                    case 4:
                        System.out.println("========== Vehiculos disponibles por Color ========");
                        String color = read.next();
                        String col = color.toLowerCase();
                        System.out.println("========== Autos disponibles por color ========");
                        vehicle.findByColor(cars,col);
                        System.out.println("========== Motos disponibles por color ========");
                        vehicle.findByColor(motocycles,col);
                        System.out.println("========== Bicicletas disponibles por color ========");
                        vehicle.findByColor(bycicles,col);
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