import java.util.*;

class Student {
    static int nextStudentId = 1;

    int studentId;
    String name;
    int age;
    char grade;

    public Student(String name, int age, char grade) {
        this.studentId = nextStudentId++;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public char getGrade() {
        return grade;
    }

}

class StudentManagementSystem {
    ArrayList<Student> students;

    public StudentManagementSystem() {
        this.students = new ArrayList<>();
    }

    public void addStudent(String name, int age, char grade) {
        Student student = new Student(name, age, grade);
        students.add(student);
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println("Student ID: " + student.getStudentId());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Grade: " + student.getGrade());
            System.out.println("------------------------");
        }
    }

    public void updateGrade(int studentId, char newGrade) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                student.setGrade(newGrade);
                System.out.println("Grade updated successfully for student with ID " + studentId);
                return;
            }
        }
        System.out.println("Student with ID " + studentId + " not found.");
    }
}

public class Task4 {
    public static void main(String[] args) {

        StudentManagementSystem system = new StudentManagementSystem();

        system.addStudent("John Doe", 20, 'A');
        system.addStudent("Jane Smith", 22, 'B');
        system.addStudent("Bob Johnson", 21, 'C');

        System.out.println("All Students:");
        system.displayAllStudents();

        system.updateGrade(2, 'A');

        System.out.println("All Students after Grade Update:");
        system.displayAllStudents();
    }
}
