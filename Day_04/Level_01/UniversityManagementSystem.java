import java.util.ArrayList;
import java.util.List;

// Main class to test the relationships
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create a university
        University university = new University("Tech University");

        // Create departments
        Department csDepartment = new Department("Computer Science");
        Department mathDepartment = new Department("Mathematics");

        // Add departments to the university
        university.addDepartment(csDepartment);
        university.addDepartment(mathDepartment);

        // Create faculty members
        Faculty profAlice = new Faculty("Prof. Sumit");
        Faculty profBob = new Faculty("Prof. Amit");

        // Add faculty members to the university
        university.addFaculty(profAlice);
        university.addFaculty(profBob);

        // Display the university structure
        System.out.println("University structure before deletion:");
        System.out.println(university);

        // Delete the university
        university.delete();

        // Display the university structure after deletion
        System.out.println("\nUniversity structure after deletion:");
        System.out.println(university);
    }
}

// Faculty class
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Faculty{name='" + name + "'}";
    }
}

// Department class
class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{name='" + name + "'}";
    }
}

// University class
class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Add a department to the university
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Add a faculty member to the university
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Delete the university (composition)
    public void delete() {
        System.out.println("Deleting university: " + name);
        System.out.println("Deleting all departments...");
        departments.clear(); // Deletes all departments (composition)
        System.out.println("All departments deleted.");
        System.out.println("Faculty members remain independent.");
    }

    @Override
    public String toString() {
        return "University{name='" + name + "', departments=" + departments + ", faculties=" + faculties + "}";
    }
}