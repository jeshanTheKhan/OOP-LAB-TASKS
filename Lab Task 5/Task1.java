class Shape {
    private double area;
    private String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
        this.area = 0.0; // Default area
    }

    // Getter and Setter methods for area
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    // Getter and Setter methods for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method to calculate the area (to be overridden by subclasses)
    public double calculateArea() {
        return 0.0; // Default implementation (to be overridden)
    }

    // Method to display information about the shape
    public void displayInfo() {
        System.out.println("Shape: " + this.getClass().getSimpleName());
        System.out.println("Color: " + color);
        System.out.println("Area: " + area);
    }
}

// Subclass Circle
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        // Calculate and set the area for the circle
        setArea(calculateArea());
    }

    // Getter and Setter methods for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        // Recalculate and set the area when the radius is updated
        setArea(calculateArea());
    }

    // Override the calculateArea method for Circle

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
        // Calculate and set the area for the rectangle
        setArea(calculateArea());
    }

    // Getter and Setter methods for length
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
        // Recalculate and set the area when the length is updated
        setArea(calculateArea());
    }

    // Getter and Setter methods for width
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        // Recalculate and set the area when the width is updated
        setArea(calculateArea());
    }

    // Override the calculateArea method for Rectangle

    public double calculateArea() {
        return length * width;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        circle.displayInfo();

        System.out.println(); // Adding a newline for better readability

        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);
        rectangle.displayInfo();
    }
}
