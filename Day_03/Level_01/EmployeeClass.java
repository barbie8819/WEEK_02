import java.util.Scanner;

public class EmployeeClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee name:");
        String name = sc.nextLine();

        System.out.println("Enter account employee id:");
        int id = sc.nextInt();
        sc.nextLine(); // Consume leftover newline character

        System.out.println("Enter designation:");
        String designation = sc.nextLine();

        // Creating an Employee object
        Employee obj = new Employee(name, id, designation);
        obj.display();

        System.out.println("Total number of Employees in the company: " + Employee.displayTotalEmployees());

        sc.close();  // Close the scanner to prevent resource leaks
    }
}

class Employee {
    private static String companyName = "XYZ"; // Shared across all instances
    private String name;
    private final int id;
    private String designation;
    private static int totalEmployee = 0;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployee++;
    }

    public void display() {
        System.out.println("Employee name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Designation: " + this.designation);
        System.out.println("Company Name: " + companyName);
    }

    public static int displayTotalEmployees() {
        return totalEmployee;
    }
}
