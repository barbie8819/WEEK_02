public class Student {
    private static String universityName = "Global University"; // Static variable shared across all students
    private static int totalStudents = 0; // Static variable to track the total number of students
    private final int rollNumber; // Final variable for unique roll number
    private String name;
    private String grade;

    // Constructor
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber; // Final variable initialized
        this.grade = grade;
        totalStudents++; // Increment total students count
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("University: " + universityName);
    }

    // Method to update grade
    public void updateGrade(String newGrade) {
        this.grade = newGrade;
    }

    // Static method to check if an object is a Student
    public static boolean isStudent(Object obj) {
        return obj instanceof Student;
    }

    // Main method for demonstration
    public static void main(String[] args) {
        // Create students
        Student s1 = new Student("Alice", 101, "A");
        Student s2 = new Student("Bob", 102, "B");

        // Display total students
        Student.displayTotalStudents();

        // Check if an object is a Student and display details
        if (Student.isStudent(s1)) {
            s1.displayDetails();
        }

        if (Student.isStudent(s2)) {
            s2.displayDetails();
        }

        // Update grade
        s1.updateGrade("A+");
        System.out.println("\nAfter Grade Update:");
        s1.displayDetails();
    }
}