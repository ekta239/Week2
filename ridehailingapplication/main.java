package packages.ridehailingapplication;

public class main {
    public static void main(String[] args) {
        Vehicle car = new Car("C001", "Alice", 10.0, "Downtown");
        Vehicle bike = new Bike("B001", "Bob", 5.0, "Uptown");
        Vehicle auto = new Auto("A001", "Charlie", 7.0, "Midtown");

        double distance = 15.0; // Distance in kilometers

        calculateFare(car, distance);
        calculateFare(bike, distance);
        calculateFare(auto, distance);
    }

    public static void calculateFare(Vehicle vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails());
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: " + vehicle.calculateFare(distance));
        System.out.println("Current Location: " + ((GPS) vehicle).getCurrentLocation());
        System.out.println("-----------------------------------");
    }
}