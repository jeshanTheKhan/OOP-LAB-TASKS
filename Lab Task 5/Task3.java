// Employee class with common attributes and methods
class Employee {
    private String name;
    private int employeeID;
    private double salary;

    // Constructor
    public Employee(String name, int employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to calculate earnings (to be overridden by subclasses)
    public double calculateEarnings() {
        return 0.0; // Default implementation, to be overridden by subclasses
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Earnings: " + calculateEarnings());
    }
}

// FullTimeEmployee class
class FullTimeEmployee extends Employee {
    private double baseSalary;

    // Constructor
    public FullTimeEmployee(String name, int employeeID, double baseSalary) {
        super(name, employeeID, 0); // Note: Setting salary to 0 initially
        this.baseSalary = baseSalary;
    }

    // Getter and Setter for baseSalary
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateEarnings() {
        // Assuming full-time employees have a fixed base salary
        return baseSalary;
    }
}

// PartTimeEmployee class
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    // Constructor
    public PartTimeEmployee(String name, int employeeID, double hourlyRate, int hoursWorked) {
        super(name, employeeID, 0); // Note: Setting salary to 0 initially
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Getters and Setters for hourlyRate and hoursWorked
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double calculateEarnings() {
        // Assuming part-time employees are paid based on hours worked and hourly rate
        return hourlyRate * hoursWorked;
    }
}

// Main class for testing
public class Task3 {
    public static void main(String[] args) {
        // Creating instances of FullTimeEmployee and PartTimeEmployee
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John Doe", 1, 50000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jane Smith", 2, 20, 30);

        // Displaying information for both employees
        fullTimeEmployee.displayInfo();
        System.out.println(); // Adding a newline for better readability
        partTimeEmployee.displayInfo();
    }
}
