abstract class Shape {
     String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double calculateArea();

    public String getShapeName() {
        return shapeName;
    }
}

class Circle extends Shape {
     double radius;

    public Circle(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;
    }


    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
     double length;
     double width;

    public Rectangle(String shapeName, double length, double width) {
        super(shapeName);
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
     double base;
     double height;

    public Triangle(String shapeName, double base, double height) {
        super(shapeName);
        this.base = base;
        this.height = height;
    }


    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Circle", 5.0);
        shapes[1] = new Rectangle("Rectangle", 4.0, 6.0);
        shapes[2] = new Triangle("Triangle", 3.0, 8.0);

        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getShapeName());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("---------------------------");
        }
    }
}
