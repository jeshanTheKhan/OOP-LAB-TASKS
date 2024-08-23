abstract class Employee {
    String name;
    int employeeId, salary;

    public Employee(String name, int employeeId, int salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public abstract void calculateSalary();
}

class HourlyEmployee extends Employee {

    public HourlyEmployee(String name, int employeeId, int salary) {
        super(name, employeeId, salary);
    }

    public void calculateSalary() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Salary: " + salary);
    }
}

class SalariedEmployee extends Employee {

    public SalariedEmployee(String name, int employeeId, int salary) {
        super(name, employeeId, salary);
    }

    public void calculateSalary() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Subject Salary: " + salary);
    }
}

public class EmployeeManageTest {
    public static void main(String[] args) {
        HourlyEmployee student = new HourlyEmployee("John Doe", 20, 12345);
        SalariedEmployee teacher = new SalariedEmployee("Jane Smith", 35, 500);

        System.out.println("\nEmployee Details:");
        student.calculateSalary();

        System.out.println("\nEmployee Details:");
        teacher.calculateSalary();
    }
}
