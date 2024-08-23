class Device {
     String brand;
     double powerUsage;

    public Device(String brand, double powerUsage) {
        this.brand = brand;
        this.powerUsage = powerUsage;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Power Usage: " + powerUsage + " watts");
    }
}

class Phone extends Device {
     String operatingSystem;

    public Phone(String brand, double powerUsage, String operatingSystem) {
        super(brand, powerUsage);
        this.operatingSystem = operatingSystem;
    }

    
    public void displayInfo() {
        System.out.println("Phone Information:");
        super.displayInfo();
        System.out.println("Operating System: " + operatingSystem);
    }
}

class Laptop extends Device {
     double screenSize;

    public Laptop(String brand, double powerUsage, double screenSize) {
        super(brand, powerUsage);
        this.screenSize = screenSize;
    }

  
    public void displayInfo() {
        System.out.println("Laptop Information:");
        super.displayInfo();
        System.out.println("Screen Size: " + screenSize + " inches");
    }
}

public class DeviceTest {
    public static void main(String[] args) {
        Phone phone = new Phone("Apple", 5.0, "iOS");
        Laptop laptop = new Laptop("Dell", 40.0, 15.6);

        phone.displayInfo();
        System.out.println();
        laptop.displayInfo();
    }
}
