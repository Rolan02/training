package funcionality;

import Vehicles.Vehicle;

import java.util.List;

public interface IVehicle {
    default void findByModel(List<Vehicle> vehicle, int model) {
        vehicle.stream().filter(car -> car.getModel() == model).forEach(System.out::println);
    }

    default void findByColor(List<Vehicle> vehicle, String color) {
        vehicle.stream().filter(car -> car.getColor().getName().equals(color)).forEach(System.out::println);
    }

    default void findByPrice(List<Vehicle> vehicle, int price) {
        vehicle.stream().filter(car -> car.getPrice() <= price).forEach(System.out::println);
    }

}
