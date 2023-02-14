import Vehicles.*;
import accessories.Color;
import accessories.Engine;
import accessories.Model;
import accessories.Passenger;
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

        Model one = new Model("2010", 20);
        Model two = new Model("2015", 25);
        Model three = new Model("2018", 50);
        Model four = new Model("2020", 100);
        Model five = new Model("2005", 150);
        Model six = new Model("2022", 250);

        Engine v6 = new Engine("v6",1500);
        Engine v7 = new Engine("v7",2500);
        Engine v8 = new Engine("v8",2000);
        Engine v4 = new Engine("v4",2500);
        Engine v9 = new Engine("v9",3500);

        Passenger uno = new Passenger(1, 100);
        Passenger dos = new Passenger(2, 200);
        Passenger cuatro = new Passenger(4, 400);
        Passenger seis = new Passenger(6, 600);

        Vehicle toyota = new Car("Toyota",blanco,one,2500,v6, cuatro);
        Vehicle mazda = new Car("Mazda",negro,two,15000,v8,seis);
        Vehicle mitsubishi = new Car("mitsubishi",amarillo,four,35000,v9,cuatro);
        Vehicle bmw = new Car("bmw",blanco,two,25000,v4, dos);
        Vehicle mercedesBenz = new Car("mercedesBenz",verde,four,18000,v7, uno);

        Vehicle pegasus = new Motocycle("pegasus",verde,one,1800,v6, cuatro);
        Vehicle suzuki = new Motocycle("suzuki",amarillo,two,11000,v8, uno);
        Vehicle junior = new Motocycle("junior",verde,four,1900,v9, seis);
        Vehicle pong = new Motocycle("pong",negro,six,1600,v7, dos);
        Vehicle dior = new Motocycle("dior",blanco,five,1200,v4, uno);

        Vehicle venzo = new Bycicle("venzo",blanco,one,2000,uno);
        Vehicle venzito = new Bycicle("venzito",negro,two,1200,dos);
        Vehicle veloshe = new Bycicle("veloshe",amarillo,three,2500,cuatro);
        Vehicle sport = new Bycicle("sport",gris,four,3500,seis);
        Vehicle argon = new Bycicle("argon",verde,five,3000,seis);

        Vehicle capix = new Skateboard("capix",negro,three,1300,15, uno);
        Vehicle nikeSb = new Skateboard("nikeSb",blanco,five,1500,17, uno);
        Vehicle circar = new Skateboard("circar",negro,two,1650,14, cuatro);
        Vehicle rbk = new Skateboard("rbk",gris,four,1960,13, seis);
        Vehicle baker = new Skateboard("baker",verde,six,10200,12,dos);

        Vehicle rex = new Balloon("rex",gris,three,1300,seis,10);
        Vehicle titan = new Balloon("titan",blanco,two,1500,seis,9);
        Vehicle fury = new Balloon("fury",negro,two,1650,cuatro,20);

        Vehicle cessna = new Airplane("cessna",blanco,six,22000,seis,20);
        Vehicle boeing = new Airplane("boeing",gris,four,25000,seis,25);
        Vehicle bombardier = new Airplane("bombardier",negro,six,15,cuatro,20);
        Vehicle airbus = new Airplane("airbus",verde,one,10000,uno,20);

        Vehicle volvo = new Truck("volvo",verde,one,18000,v8, cuatro,40);
        Vehicle scania = new Truck("scania",amarillo,two,11000,v9, dos,5);
        Vehicle isuzu = new Truck("isuzu",verde,six,1900,v4, seis,10);
        Vehicle nissan = new Truck("nissan",negro,five,1600,v7, dos,15);
        Vehicle mitsubi = new Truck("mitsubi", blanco, three, 500000, v6, seis, 80);

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
                        String model = read.next();
                        String mode = model.toLowerCase();
                        System.out.println("========== Autos disponibles por Modelo ========");
                        vehicle.findByModel(cars,mode);
                        System.out.println("========== Motos disponibles por Modelo ========");
                        vehicle.findByModel(motocycles,mode);
                        System.out.println("========== Bicicletas disponibles por Modelo ========");
                        vehicle.findByModel(bycicles,mode);
                        System.out.println("========== Skateboards disponibles por Modelo ========");
                        vehicle.findByModel(skateboards,mode);
                        System.out.println("========== dirigibles disponibles para su presupuesto ========");
                        vehicle.findByModel(ballons,mode);
                        System.out.println("========== avionetas disponibles para su presupuesto ========");
                        vehicle.findByModel(Airplanes,mode);
                        System.out.println("========== Camiones disponibles por Modelo ========");
                        vehicle.findByModel(Truck,mode);
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