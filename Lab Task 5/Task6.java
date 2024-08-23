class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Calculate and return the total cost of the product
    public double calculateTotalCost() {
        return price * quantity;
    }

    // Display product information
    public void displayProductInfo() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }
}

class Electronics extends Product {
    private String brand;

    // Constructor
    public Electronics(String name, double price, int quantity, String brand) {
        super(name, price, quantity);
        this.brand = brand;
    }

    // Getter and setter methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Brand: " + brand);
    }
}

class Clothing extends Product {
    private String size;

    // Constructor
    public Clothing(String name, double price, int quantity, String size) {
        super(name, price, quantity);
        this.size = size;
    }

    // Getter and setter methods
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Size: " + size);
    }
}

public class Task6 {
    public static void main(String[] args) {
        // Example usage
        Electronics laptop = new Electronics("Laptop", 1200.00, 1, "Dell");
        Clothing shirt = new Clothing("T-Shirt", 25.00, 3, "Medium");

        // Display product information
        laptop.displayProductInfo();
        System.out.println("Total Cost: $" + laptop.calculateTotalCost());

        System.out.println();

        shirt.displayProductInfo();
        System.out.println("Total Cost: $" + shirt.calculateTotalCost());
    }
}
