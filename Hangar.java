public class Hangar {
    public static void main(String[] args) {
        Vehicle[] myVehicles = {
                new Car("Alfa Romeo", 100000),
                new Car("Alpine", 100000),
                new Car("BMW", 100000),
                new Car("Chevrolet", 100000),
                new Boat("Hobie Cat", 1000),
                new Boat("Zodiac", 1000),
                new Boat("Bayliner", 1000)
        };

        for (Vehicle vehicle : myVehicles) {
            System.out.println(vehicle.doStuff());
        }
    }

}
