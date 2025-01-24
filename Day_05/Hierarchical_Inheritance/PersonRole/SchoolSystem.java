package PersonRole;

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alice Johnson", 35, "Mathematics");
        Student student = new Student("Bob Smith", 16, "10th Grade");
        Staff staff = new Staff("Charlie Brown", 40, "Administration");

        // Display information and roles
        teacher.displayInfo();
        teacher.displayRole();

        student.displayInfo();
        student.displayRole();

        staff.displayInfo();
        staff.displayRole();
    }
}
