class Vehicle {
    String makeBy;
    int makingYear;

    public Vehicle(String makeBy, int makingYear) {
        this.makeBy = makeBy;
        this.makingYear = makingYear;
    }

    public void displayVehicleInfo() {
        System.out.println("Make: " + makeBy);
        System.out.println("Year: " + makingYear);
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String makeBy, int makingYear, int numberOfDoors) {
        super(makeBy, makingYear);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(String makeBy, int makingYear, boolean hasSideCar) {
        super(makeBy, makingYear);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Has sidecar: " + (hasSideCar ? "Yes" : "No"));
    }
}

public class VehiclesTest {
    public static void main(String[] args) {
        // Create instances of Car and Motorcycle
        Car myCar = new Car("Toyota", 2022, 4);
        Motorcycle myMotorcycle = new Motorcycle("Honda", 2021, false);

        // Display information for both vehicle instances
        System.out.println("Car Information:");
        myCar.displayVehicleInfo();

        System.out.println("\nMotorcycle Information:");
        myMotorcycle.displayVehicleInfo();
    }
}
