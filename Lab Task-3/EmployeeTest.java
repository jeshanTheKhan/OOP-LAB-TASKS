class Employee {
    String name;
    int employeeId;
    double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 80000, "HR");
        Developer developer = new Developer("Bob", 201, 70000, "Java");

        System.out.println("Manager Information:");
        manager.displayInfo();

        System.out.println("\nDeveloper Information:");
        developer.displayInfo();
    }
}
