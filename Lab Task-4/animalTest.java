abstract class Animal {
    abstract void makeSound();

    abstract void move();
}

class Dog extends Animal {

    void makeSound() {
        System.out.println("Dog barks");
    }

    void move() {
        System.out.println("Dog walks");
    }
}

class Bird extends Animal {

    void makeSound() {
        System.out.println("Bird chirps");
    }

    void move() {
        System.out.println("Bird flies");
    }
}

public class animalTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();

        System.out.println("Dog:");
        dog.makeSound();
        dog.move();

        System.out.println("\nBird:");
        bird.makeSound();
        bird.move();
    }
}
