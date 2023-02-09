package funcionality;

import Vehicles.Vehicle;

import java.util.List;

public interface IVehicleMotor {
    default void findByEngine(List<Vehicle> vehicles, String engine){
        vehicles.stream().filter(car -> car.getEngine().getName().equals(engine)).forEach(System.out::println);
    }
}