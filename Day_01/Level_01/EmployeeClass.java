import java.util.Scanner;

class Employee {
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void Display() {
        System.out.println("Name of Employee: " + this.name);
        System.out.println("ID of Employee: " + this.id);
        System.out.println("Salary of Employee: " + this.salary);
    }
}

public class EmployeeClass {
    public static void main(String[] args) {
        // Create an Employee object
        Employee e1 = new Employee("Anshi", 10, 100.4);

        // Display employee details
        e1.Display();
    }
}
