abstract class Vehicle {
    String make;
    int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public abstract void start();
}

class Car extends Vehicle {
    public Car(String make, int year) {
        super(make, year);
    }

    public void start() {
        System.out.println("Starting the car...");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String make, int year) {
        super(make, year);
    }

    public void start() {
        System.out.println("Starting the motorcycle...");
    }
}

public class vehicleTest {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2023);
        Motorcycle motorcycle = new Motorcycle("Honda", 2023);

        car.start();
        motorcycle.start();
    }
}
