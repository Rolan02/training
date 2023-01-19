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

        Bycicle venzo = new Bycicle("venzo","blanco",2010,2000);
        Bycicle venzito = new Bycicle("venzito","negro",2015,1200);
        Bycicle veloshe = new Bycicle("veloshe","amarillo",2018,2500);
        Bycicle sport = new Bycicle("sport","gris",2020,3500);
        Bycicle argon = new Bycicle("argon","verde",2005,3000);

        Motocycle pegasus =  new Motocycle("pegasus","negro","v6",2015,1534,10000);
        Motocycle suzuki =  new Motocycle("suzuki","rojo","v8",2010,15354,15000);
        Motocycle bmw =  new Motocycle("bmw","rojo","v5",2005,1654,18000);
        Motocycle junior =  new Motocycle("junior","verde","v8",2010,15334,20000);


        List<Car> cars = new ArrayList<Car>();
        cars.add(toyota);
        cars.add(mitsubishi);
        cars.add(mazda);
        cars.add(BMW);
        cars.add(mercedes_benz);
        cars.add(chevrolet);

        List<Bycicle> bycicles =  new ArrayList<Bycicle>();
        bycicles.add(venzo);
        bycicles.add(venzito);
        bycicles.add(veloshe);
        bycicles.add(sport);
        bycicles.add(argon);

        List<Motocycle> motocycles =  new ArrayList<Motocycle>();
        motocycles.add(junior);
        motocycles.add(bmw);
        motocycles.add(suzuki);
        motocycles.add(pegasus);


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
                        System.out.println("Ingrese su Precio estimado");
                        int amount;
                        amount = sn.nextInt();
                        System.out.println("========== Vehiculos disponibles para su presupuesto ========");
                        Car.findByPrice(cars,amount);
                        System.out.println("========== Motos disponibles para su presupuesto ========");
                        Motocycle.findByPrice(motocycles,amount);
                        System.out.println("========== Bicicletas disponibles para su presupuesto ========");
                        Bycicle.findByPrice(bycicles,amount);
                        System.out.println("===========================================================");
                        break;
                    case 2:
                        System.out.println("Buscando por modelo........");
                        int model;
                        model = sn.nextInt();
                        System.out.println("========== Autos disponibles por Modelo ========");
                        Car.findByModel(cars,model);
                        System.out.println("========== Motos disponibles por Modelo ========");
                        Motocycle.findByModel(motocycles,model);
                        System.out.println("========== Bicicletas disponibles por Modelo ========");
                        Bycicle.findByModel(bycicles,model);
                        System.out.println("===========================================================");
                        break;
                    case 3:
                        System.out.println("Buscando por motor.....");
                        String engine = read.next();
                        String var = engine.toLowerCase();
                        System.out.println("========== Autos disponibles por Motor ========");
                        Car.findByEngine(cars,var);
                        System.out.println("========== Motos disponibles por Motor ========");
                        Motocycle.findByEngine(motocycles,var);
                        System.out.println("===========================================================");
                        break;
                    case 4:
                        System.out.println("========== Vehiculos disponibles por Color ========");
                        String color = read.next();
                        String col = color.toLowerCase();
                        System.out.println("========== Vehiculos disponibles por color ========");
                        Car.findByColor(cars,col);
                        System.out.println("========== Motos disponibles por color ========");
                        Motocycle.findByColor(motocycles,col);
                        System.out.println("========== Bicicletas disponibles por color ========");
                        Bycicle.findByColor(bycicles,col);
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