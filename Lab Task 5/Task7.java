// Base class Animal
class Animal {
    // Attributes
    private String habitat;
    private String diet;

    // Constructor
    public Animal(String habitat, String diet) {
        this.habitat = habitat;
        this.diet = diet;
    }

    // Getters and Setters
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    // Polymorphic method
    public void displayCharacteristics() {
        System.out.println("Habitat: " + habitat);
        System.out.println("Diet: " + diet);
    }
}

// Subclass Mammal
class Mammal extends Animal {
    // Additional attribute specific to Mammals
    private boolean hasFur;

    // Constructor
    public Mammal(String habitat, String diet, boolean hasFur) {
        super(habitat, diet);
        this.hasFur = hasFur;
    }

    // Getter and Setter for the additional attribute
    public boolean hasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public void displayCharacteristics() {
        super.displayCharacteristics(); // Call the base class method
        System.out.println("Has Fur: " + hasFur);
    }
}

// Subclass Bird
class Bird extends Animal {
    // Additional attribute specific to Birds
    private boolean canFly;

    // Constructor
    public Bird(String habitat, String diet, boolean canFly) {
        super(habitat, diet);
        this.canFly = canFly;
    }

    // Getter and Setter for the additional attribute
    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public void displayCharacteristics() {
        super.displayCharacteristics(); // Call the base class method
        System.out.println("Can Fly: " + canFly);
    }
}

// Main class for testing
public class Task7 {
    public static void main(String[] args) {
        // Creating instances of Mammal and Bird
        Mammal lion = new Mammal("Grassland", "Carnivore", true);
        Bird sparrow = new Bird("Forest", "Seeds", true);

        // Displaying characteristics using polymorphism
        System.out.println("Mammal Characteristics:");
        lion.displayCharacteristics();

        System.out.println("\nBird Characteristics:");
        sparrow.displayCharacteristics();
    }
}
