class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class PersonManager {
    public void displayPersonDetails(Person person) {
        try {
            if (person == null || person.getName() == null) {
                throw new NullPointerException("Person or person's name is null");
            }

            System.out.println("Person Details:");
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (NullPointerException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

public class Task5 {
    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();

        // Test with a valid Person object
        Person validPerson = new Person("John Doe", 25);
        personManager.displayPersonDetails(validPerson);

        // Test with a null Person object
        Person nullPerson = null;
        personManager.displayPersonDetails(nullPerson);

        // Test with a Person object having a null name
        Person personWithNullName = new Person(null, 30);
        personManager.displayPersonDetails(personWithNullName);
    }
}
