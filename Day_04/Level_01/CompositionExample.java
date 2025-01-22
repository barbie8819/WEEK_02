import java.util.ArrayList;
import java.util.List;


// Main class to test composition
public class CompositionExample {
    public static void main(String[] args) {
        // Create employees
        Employee emp1 = new Employee("Sumit");
        Employee emp2 = new Employee("Kumar");
        Employee emp3 = new Employee("Amit");

        // Create departments and add employees
        Department dept1 = new Department("HR");
        dept1.addEmployee(emp1);

        Department dept2 = new Department("IT");
        dept2.addEmployee(emp2);
        dept2.addEmployee(emp3);

        // Create a company and add departments
        Company company = new Company("TechCorp");
        company.addDepartment(dept1);
        company.addDepartment(dept2);

        // Print company structure
        System.out.println("Company structure before deletion:");
        System.out.println(company);

        // Delete the company
        company.delete();

        // Print company structure after deletion
        System.out.println("Company structure after deletion:");
        System.out.println(company);
    }
}


// Employee class
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "'}";
    }
}

// Department class
class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Get the list of employees
    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department{name='" + name + "', employees=" + employees + "}";
    }
}

// Company class
class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Add a department to the company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Get the list of departments
    public List<Department> getDepartments() {
        return departments;
    }

    // Clear all departments and employees
    public void delete() {
        System.out.println("Deleting company: " + name);
        for (Department department : departments) {
            System.out.println("Deleting department: " + department);
            department.getEmployees().clear();
        }
        departments.clear();
        System.out.println("All departments and employees deleted.");
    }

    @Override
    public String toString() {
        return "Company{name='" + name + "', departments=" + departments + "}";
    }
}