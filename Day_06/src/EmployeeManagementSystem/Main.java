package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();

            FullTimeEmployee emp1 = new FullTimeEmployee(101, "Alice", 50000);
            emp1.assignDepartment("HR");
            employees.add(emp1);

            PartTimeEmployee emp2 = new PartTimeEmployee(102, "Bob", 20, 80);
            emp2.assignDepartment("Finance");
            employees.add(emp2);

            // Using polymorphism to process and display details
            for (Employee emp : employees) {
                emp.displayDetails();
                if (emp instanceof Department) {
                    System.out.println(((Department) emp).getDepartmentDetails());
                }
                System.out.println("--------------------------------");
            }
        }
    }


