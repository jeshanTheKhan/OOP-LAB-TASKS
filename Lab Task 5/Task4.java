class Vehicle {
    private String make;
    private String model;
    private double rentalRate;

    public Vehicle(String make, String model, double rentalRate) {
        this.make = make;
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public void displayVehicleInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Rental Rate: $" + rentalRate + " per day");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, double rentalRate, int numberOfDoors) {
        super(make, model, rentalRate);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    // You can add additional methods specific to Car if needed
}

class Bike extends Vehicle {
    private boolean hasBasket;

    public Bike(String make, String model, double rentalRate, boolean hasBasket) {
        super(make, model, rentalRate);
        this.hasBasket = hasBasket;
    }

    public boolean isHasBasket() {
        return hasBasket;
    }

    public void setHasBasket(boolean hasBasket) {
        this.hasBasket = hasBasket;
    }

    // You can add additional methods specific to Bike if needed
}

public class Task4 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 30.0, 4);
        Bike bike = new Bike("Schwinn", "Cruiser", 10.0, true);

        // Display vehicle information
        System.out.println("Car Information:");
        car.displayVehicleInfo();
        System.out.println("Number of Doors: " + car.getNumberOfDoors());

        System.out.println("\nBike Information:");
        bike.displayVehicleInfo();
        System.out.println("Has Basket: " + bike.isHasBasket());

        // Calculate rental cost
        int rentalDays = 3;
        System.out.println("\nRental cost for " + rentalDays + " days:");
        System.out.println("Car Rental Cost: $" + car.calculateRentalCost(rentalDays));
        System.out.println("Bike Rental Cost: $" + bike.calculateRentalCost(rentalDays));
    }
}
