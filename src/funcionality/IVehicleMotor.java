package funcionality;

import Vehicles.Vehicle;
import Vehicles.VehicleMotor;

import java.util.List;

public interface IVehicleMotor {
    default void findByEngine(List<Vehicle> vehicles, String engine){
        vehicles.stream().filter(car -> ((VehicleMotor)car).getEngine().equals(engine)).forEach(System.out::println);
    }
}
