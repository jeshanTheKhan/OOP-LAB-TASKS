abstract class Shape {
    public abstract double calculateArea();
}

class Rectangle extends Shape {
     double width;
     double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double calculateArea() {
        return width * height;
    }
}

class Circle extends Shape {
     double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class ShapeTesst {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(4);

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Circle Area: " + circle.calculateArea());
    }
}
