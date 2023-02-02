import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Vehicle toyota = new Car("Toyota","blanco",2010,25000,"v6", 4,4,8);
        Vehicle mazda = new Car("Mazda","gris",2015,15000,"v6", 6,6,7);
        Vehicle mitsubishi = new Car("mitsubishi","amarillo",2020,35000,"v6", 7,4,15);
        Vehicle bmw = new Car("bmw","blanco",2015,25000,"v8", 3,4,25);
        Vehicle mercedesBenz = new Car("mercedesBenz","verde",2020,18000,"v8", 8,6,16);

        Vehicle venzo = new Bycicle("venzo","blanco",2010,2000,2,2,15);
        Vehicle venzito = new Bycicle("venzito","negro",2015,1200,2,2,16);
        Vehicle veloshe = new Bycicle("veloshe","amarillo",2018,2500,3,2,19);
        Vehicle sport = new Bycicle("sport","gris",2020,3500,4,2,25);
        Vehicle argon = new Bycicle("argon","verde",2005,3000,1,2,14);

        Vehicle pegasus = new Motocycle("pegasus","verde",2010,1800,"v6", 4,4,18);
        Vehicle suzuki = new Motocycle("suzuki","amarillo",2015,11000,"v8", 2,2,19);
        Vehicle junior = new Motocycle("junior","verde",2020,1900,"v6", 3,2,16);
        Vehicle pong = new Motocycle("pong","negro",2022,1600,"v8", 2,2,19);
        Vehicle dior = new Motocycle("dior","blanco",2005,1200,"v6", 1,2,20);

        Vehicle capix = new Skateboard("capix","Cafe",2018,1300,15, 1,4,0);
        Vehicle nikeSb = new Skateboard("nikeSb","rojo",2015,1500,17, 1,4,0);
        Vehicle circar = new Skateboard("circar","negro",2015,1650,14, 1,6,0);
        Vehicle rbk = new Skateboard("rbk","gris",2020,1960,13, 2,2,0);
        Vehicle baker = new Skateboard("baker","verde",2022,10200,12,1,6,0);

        Vehicle rex = new Balloon("rex","Cafe",2018,1300,8,10,0,0);
        Vehicle titan = new Balloon("titan","rojo",2015,1500,7,9,0,0);
        Vehicle fury = new Balloon("fury","negro",2015,1650,15,20,0,0);

        Vehicle cessna = new Airplane("cessna","rojo",2022,22000,20,20,2,0);
        Vehicle boeing = new Airplane("boeing","gris",2020,25000,25,25,4,0);
        Vehicle bombardier = new Airplane("bombardier","negro",15000,15,15,20,2,0);
        Vehicle airbus = new Airplane("airbus","verde",2012,10000,10,20,2,0);

        Vehicle volvo = new Truck("volvo","verde",2010,18000,"v6", 4,40,8,26);
        Vehicle scania = new Truck("scania","amarillo",2015,11000,"v8", 2,5,6,14);
        Vehicle isuzu = new Truck("isuzu","verde",2020,1900,"v6", 3,10,8,26);
        Vehicle nissan = new Truck("nissan","negro",2022,1600,"v8", 2,15,6,10);
        Vehicle mitsubi = new Truck("mitsubi", "blanco", 2003, 500000, "v8", 3, 80,8,5);

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

        List<Vehicle> motocycles = new ArrayList<>();
        motocycles.add(pegasus);
        motocycles.add(suzuki);
        motocycles.add(junior);
        motocycles.add(pong);
        motocycles.add(dior);

        List<Vehicle> skateboards = new ArrayList<>();
        skateboards.add(capix);
        skateboards.add(nikeSb);
        skateboards.add(circar);
        skateboards.add(rbk);
        skateboards.add(baker);

        List<Vehicle> ballons = new ArrayList<>();
        ballons.add(rex);
        ballons.add(titan);
        ballons.add(fury);

        List<Vehicle> Airplanes = new ArrayList<>();
        Airplanes.add(cessna);
        Airplanes.add(boeing);
        Airplanes.add(bombardier);
        Airplanes.add(airbus);

        List<Vehicle> Truck = new ArrayList<>();
        Truck.add(volvo);
        Truck.add(scania);
        Truck.add(isuzu);
        Truck.add(nissan); 
        Truck.add(mitsubi);


        IVehicle vehicle = new IVehicle() {};
        IVehicleMotor vehicleMotor = new IVehicleMotor() {};
        IVehicleSice vehicleSice = new IVehicleSice() {};

        IVehicleCapacity vehicleCapacity = new IVehicleCapacity() {};
        IVehicleAro VehicleAro = new IVehicleAro() {};

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
            System.out.println("5.- Buscar por tamaño");
            System.out.println("6.- Buscar por tamaño de Aro");
            System.out.println("7.- Buscar por Capacidad");
            System.out.println("8.- Buscar por Tonelaje");
            System.out.println("9.- Salir");

            try {
                System.out.println("Escribe una de las opciones");
                option = sn.nextInt();
                switch (option) {
                    case 1:
                        Scanner price = new Scanner(System.in);
                        System.out.println("Ingrese su Precio estimado");
                        int amount;
                        amount = sn.nextInt();
                        System.out.println("========== Autos disponibles para su presupuesto ========");
                        vehicle.findByPrice(cars,amount);
                        System.out.println("========== Motos disponibles para su presupuesto ========");
                        vehicle.findByPrice(motocycles,amount);
                        System.out.println("========== Bicicletas disponibles para su presupuesto ========");
                        vehicle.findByPrice(bycicles,amount);
                        System.out.println("========== Skateboards disponibles para su presupuesto ========");
                        vehicle.findByPrice(skateboards,amount);
                        System.out.println("========== dirigibles disponibles para su presupuesto ========");
                        vehicle.findByPrice(ballons,amount);
                        System.out.println("========== avionetas disponibles para su presupuesto ========");
                        vehicle.findByPrice(Airplanes,amount);
                        System.out.println("========== Camiones disponibles para su presupuesto ========");
                        vehicle.findByPrice(Truck,amount);
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
                        System.out.println("========== Skateboards disponibles por Modelo ========");
                        vehicle.findByModel(skateboards,model);
                        System.out.println("========== dirigibles disponibles para su presupuesto ========");
                        vehicle.findByModel(ballons,model);
                        System.out.println("========== avionetas disponibles para su presupuesto ========");
                        vehicle.findByModel(Airplanes,model);
                        System.out.println("========== Camiones disponibles por Modelo ========");
                        vehicle.findByModel(Truck,model);
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
                        System.out.println("========== dirigibles disponibles por Motor ========");
                        vehicleMotor.findByEngine(ballons,var);
                        System.out.println("========== avionetas disponibles por Motor ========");
                        vehicleMotor.findByEngine(Airplanes,var);
                        System.out.println("========== Camiones disponibles por Motor ========");
                        vehicleMotor.findByEngine(Truck,var);
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
                        System.out.println("========== Skateboards disponibles por color ========");
                        vehicle.findByColor(skateboards,col);
                        System.out.println("========== dirigibles disponibles por color ========");
                        vehicle.findByColor(ballons,col);
                        System.out.println("========== avionetas disponibles por color ========");
                        vehicle.findByColor(Airplanes,col);
                        System.out.println("========== Camiones disponibles por color ========");
                        vehicle.findByColor(Truck,col);
                        System.out.println("===========================================================");
                        break;
                    case 5:
                        System.out.println("Ingrese el tamaño de la Skateborad que desea");
                        int sice;
                        sice = sn.nextInt();
                        System.out.println("========== Skateboards disponibles por Tamaño ========");
                        vehicleSice.findBySice(skateboards,sice);
                        break;
                    case 6:
                        System.out.println("Ingrese el tamaño de aro que desea");
                        int aro;
                        aro = sn.nextInt();
                        System.out.println("========== Vehiculos disponibles por Tamaño de Aro ========");
                        VehicleAro.findByAro(cars,aro);
                        System.out.println("========== Motos disponibles por Tamaño de Aro  ========");
                        VehicleAro.findByAro(motocycles,aro);
                        System.out.println("========== Bicicletas disponibles por Tamaño de Aro  ========");
                        VehicleAro.findByAro(bycicles, aro);
                        System.out.println("========== Camiones disponibles por Tamaño de Aro  ========");
                        VehicleAro.findByAro(Truck,aro);
                        System.out.println("===========================================================");
                        break;
                    case 7:
                        System.out.println("Ingrese la capacidad del globo que desea");
                        int capacity;
                        capacity = sn.nextInt();
                        System.out.println("========== Globo disponibles por Tamaño ========");
                        vehicleCapacity.findByCapacity(ballons,capacity);
                        break;
                    case 8:
                        System.out.println("ingrese la tonelada que desee");
                        int ton;
                        ton = sn.nextInt();
                        System.out.println("========== Camiones disponibles por tonelada ========");
                        
                    case 9:
                        exit = true;
                        break;
                    default:
                        System.out.println("Solo opciones de 1 a 8");
                }
            } catch (InputMismatchException e) {
                System.out.println("Opcion incorrecta ingresa un numero");
                sn.next();
            }
        }
    }
}