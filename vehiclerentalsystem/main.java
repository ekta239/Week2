package packages.vehiclerentalsystem;

public class main {
    public static void main(String[] args) {
        Vehicle car = new Car("CAR123", 50);
        Vehicle bike = new Bike("BIKE123", 20);
        Vehicle truck = new Truck("TRUCK123", 100);
        Insurable insuredCar = new InsuredVehicle("CAR456", "Car", 60, "INS123");

        Vehicle[] vehicles = {car, bike, truck, (Vehicle) insuredCar};

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getType() + " Rental Cost for 5 days: " + vehicle.calculateRentalCost(5));
            if (vehicle instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) vehicle;
                System.out.println(insurableVehicle.getInsuranceDetails());
                System.out.println("Insurance Cost: " + insurableVehicle.calculateInsurance());
            }
            System.out.println();
        }
    }
}