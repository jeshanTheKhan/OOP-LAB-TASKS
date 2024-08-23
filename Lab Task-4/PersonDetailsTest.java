abstract class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void displayDetails();
}

class Student extends Person {
    int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student ID: " + studentId);
    }
}

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayDetails() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher Age: " + age);
        System.out.println("Subject Taught: " + subject);
    }
}

public class PersonDetailsTest {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20, 12345);
        Teacher teacher = new Teacher("Jane Smith", 35, "Mathematics");

        System.out.println("Student Details:");
        student.displayDetails();

        System.out.println("\nTeacher Details:");
        teacher.displayDetails();
    }
}
