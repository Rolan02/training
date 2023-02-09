import Vehicles.*;
import accessories.Color;
import accessories.Engine;
import funcionality.IVehicle;
import funcionality.IVehicleCapacity;
import funcionality.IVehicleMotor;
import funcionality.IVehicleSice;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Color blanco = new Color("blanco", 50);
        Color negro = new Color("negro", 150);
        Color amarillo = new Color("amarillo", 75);
        Color verde = new Color("verde", 85);
        Color gris = new Color("gris", 300);

        Engine v6 = new Engine("v6",1500);
        Engine v7 = new Engine("v7",2500);
        Engine v8 = new Engine("v8",2000);
        Engine v4 = new Engine("v4",2500);
        Engine v9 = new Engine("v9",3500);


        Vehicle toyota = new Car("Toyota",blanco,2010,2500,v6, 4);
        Vehicle mazda = new Car("Mazda",negro,2015,15000,v8, 6);
        Vehicle mitsubishi = new Car("mitsubishi",amarillo,2020,35000,v9, 7);
        Vehicle bmw = new Car("bmw",blanco,2015,25000,v4, 3);
        Vehicle mercedesBenz = new Car("mercedesBenz",verde,2020,18000,v7, 8);

        Vehicle venzo = new Bycicle("venzo",blanco,2010,2000,2);
        Vehicle venzito = new Bycicle("venzito",negro,2015,1200,2);
        Vehicle veloshe = new Bycicle("veloshe",amarillo,2018,2500,3);
        Vehicle sport = new Bycicle("sport",gris,2020,3500,4);
        Vehicle argon = new Bycicle("argon",verde,2005,3000,1);

        Vehicle pegasus = new Motocycle("pegasus",verde,2010,1800,v6, 4);
        Vehicle suzuki = new Motocycle("suzuki",amarillo,2015,11000,v8, 2);
        Vehicle junior = new Motocycle("junior",verde,2020,1900,v9, 3);
        Vehicle pong = new Motocycle("pong",negro,2022,1600,v7, 2);
        Vehicle dior = new Motocycle("dior",blanco,2005,1200,v4, 1);

        Vehicle capix = new Skateboard("capix",negro,2018,1300,15, 1);
        Vehicle nikeSb = new Skateboard("nikeSb",blanco,2015,1500,17, 1);
        Vehicle circar = new Skateboard("circar",negro,2015,1650,14, 1);
        Vehicle rbk = new Skateboard("rbk",gris,2020,1960,13, 2);
        Vehicle baker = new Skateboard("baker",verde,2022,10200,12,1);

        Vehicle rex = new Balloon("rex",gris,2018,1300,8,10);
        Vehicle titan = new Balloon("titan",blanco,2015,1500,7,9);
        Vehicle fury = new Balloon("fury",negro,2015,1650,15,20);

        Vehicle cessna = new Airplane("cessna",blanco,2022,22000,20,20);
        Vehicle boeing = new Airplane("boeing",gris,2020,25000,25,25);
        Vehicle bombardier = new Airplane("bombardier",negro,15000,15,15,20);
        Vehicle airbus = new Airplane("airbus",verde,2012,10000,10,20);

        Vehicle volvo = new Truck("volvo",verde,2010,18000,v8, 4,40);
        Vehicle scania = new Truck("scania",amarillo,2015,11000,v9, 2,5);
        Vehicle isuzu = new Truck("isuzu",verde,2020,1900,v4, 3,10);
        Vehicle nissan = new Truck("nissan",negro,2022,1600,v7, 2,15);
        Vehicle mitsubi = new Truck("mitsubi", blanco, 2003, 500000, v6, 3, 80);

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
            System.out.println("6.- Buscar por Capacidad");
            System.out.println("7.- Buscar por Tonelaje");
            System.out.println("8.- Salir");

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
                        /*System.out.println("========== dirigibles disponibles por Motor ========");
                        vehicleMotor.findByEngine(ballons,var);
                        System.out.println("========== avionetas disponibles por Motor ========");
                        vehicleMotor.findByEngine(Airplanes,var);*/
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
                        System.out.println("Ingrese la capacidad del globo que desea");
                        int capacity;
                        capacity = sn.nextInt();
                        System.out.println("========== Globo disponibles por Tamaño ========");
                        vehicleCapacity.findByCapacity(ballons,capacity);
                        break;
                    case 7:
                        System.out.println("ingrese la tonelada que desee");
                        int ton;
                        ton = sn.nextInt();
                        System.out.println("========== Camiones disponibles por tonelada ========");
                        
                    case 8:
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