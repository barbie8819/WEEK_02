import java.util.Scanner;

    // Main method
	public class CourseClass{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Update institute name
        System.out.println("Enter the institute name:");
        String newInstituteName = scanner.nextLine();
        Course.updateInstituteName(newInstituteName);

        // Take input for a course
        System.out.println("Enter the course details:");

        System.out.print("Course Name: ");
        String courseName = scanner.nextLine();

        System.out.print("Duration (in weeks): ");
        int duration = scanner.nextInt();

        System.out.print("Fee: ");
        double fee = scanner.nextDouble();

        // Create course object
        Course course = new Course(courseName, duration, fee);

        // Display course details
        System.out.println("\n--- Course Details ---");
        course.displayCourseDetails();

        scanner.close();
    }
}
public class Course {
    // Instance variables
    private String courseName;
    private int duration; // Duration in weeks
    private double fee;

    // Class variable (shared among all courses)
    private static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}
