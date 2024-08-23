import java.util.*;

class Student {
    private String studentName;
    private String studentID;
    private int[] grades;

    // Constructor
    public Student(String studentName, String studentID, int[] grades) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.grades = grades;
    }

    // Getter and Setter methods
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    // Polymorphic method to calculate average grade
    public double calculateAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // Polymorphic method to display student information
    public void displayStudentInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Average Grade: " + calculateAverageGrade());
    }
}

class Undergraduate extends Student {
    // Additional attributes or methods specific to Undergraduate can be added here

    // Constructor
    public Undergraduate(String studentName, String studentID, int[] grades) {
        super(studentName, studentID, grades);
    }
}

class Graduate extends Student {
    // Additional attributes or methods specific to Graduate can be added here

    // Constructor
    public Graduate(String studentName, String studentID, int[] grades) {
        super(studentName, studentID, grades);
    }
}

public class Task9 {
    public static void main(String[] args) {
        // Example usage
        int[] undergradGrades = { 85, 90, 78, 92, 88 };
        Undergraduate undergradStudent = new Undergraduate("John Doe", "U12345", undergradGrades);
        undergradStudent.displayStudentInfo();

        System.out.println(); // Just to separate the outputs

        int[] gradGrades = { 92, 88, 95, 89, 94 };
        Graduate gradStudent = new Graduate("Jane Smith", "G67890", gradGrades);
        gradStudent.displayStudentInfo();
    }
}
