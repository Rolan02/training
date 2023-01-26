import java.util.List;

public interface IVehicleCapacity {
    default void findByCapacity(List<Vehicle> vehicles, int capacity) {
        vehicles.stream().filter(car -> ((VehicleCapacity)car).getCapacity() == capacity).forEach(System.out::println);
        }
}
