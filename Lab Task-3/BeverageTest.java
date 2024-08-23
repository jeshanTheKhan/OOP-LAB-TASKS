class Beverage {
    String name;
    double price;

    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Beverage Information:");
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }
}

class Coffee extends Beverage {
    int caffeineLevel;

    public Coffee(String name, double price, int caffeineLevel) {
        super(name, price);
        this.caffeineLevel = caffeineLevel;
    }

    public void displayInfo() {
        System.out.println("Coffee Information:");
        super.displayInfo();
        System.out.println("Caffeine Level: " + caffeineLevel + " mg");
    }
}

class Soda extends Beverage {
    boolean isDiet;

    public Soda(String name, double price, boolean isDiet) {
        super(name, price);
        this.isDiet = isDiet;
    }

    public void displayInfo() {
        System.out.println("Soda Information:");
        super.displayInfo();
        System.out.println("Diet: " + (isDiet ? "Yes" : "No"));
    }
}

public class BeverageTest {
    public static void main(String[] args) {
        Coffee coffee = new Coffee("Espresso", 3.5, 80);
        Soda soda = new Soda("Coca-Cola", 1.99, false);

        coffee.displayInfo();
        System.out.println();
        soda.displayInfo();
    }
}
