import java.util.List;

public interface IVehicleAro {

    default void findByAro(List<Vehicle> vehicles, int aro) {
            vehicles.stream().filter(car -> car.getAro() == aro).forEach(System.out::println);
        }
}

