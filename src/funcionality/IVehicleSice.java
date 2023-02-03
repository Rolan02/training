package funcionality;

import Vehicles.Vehicle;
import Vehicles.VehicleSice;

import java.util.List;

public interface IVehicleSice {
    default void findBySice(List<Vehicle> vehicles, int sice) {
        vehicles.stream().filter(car -> ((VehicleSice)car).getSice() == sice).forEach(System.out::println);
    }
}
