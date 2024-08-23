abstract class Shape {
    abstract double calculateArea();

    abstract double calculatePerimeter();
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {

        return (length * width);
    }

    double calculatePerimeter() {

        return (2 * (length + width));
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class ShapeCode {

    public static void main(String[] args) {
        double length = 2.5;
        double width = 3.0;
        Rectangle rectangle = new Rectangle(length, width);
        double radius = 4.0;
        Circle circle = new Circle(radius);
        System.out.println("Length of Rectangle: " + length);
        System.out.println("Width of Rectangle: " + width);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.calculatePerimeter());
        System.out.println("Radius of Circle: " + radius);
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Perimeter of Circle: " + circle.calculatePerimeter());
    }

}
