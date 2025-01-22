import java.util.ArrayList;
import java.util.List;

// Main class to test the relationships
public class SchoolManagementSystem {
    public static void main(String[] args) {
        // Create school
        School school = new School("Green Valley High");

        // Create students
        Student student1 = new Student("Sumit");
        Student student2 = new Student("Amit");

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Create courses
        Course course1 = new Course("Math");
        Course course2 = new Course("Science");

        // Enroll students in courses
        student1.addCourse(course1);
        student1.addCourse(course2);

        student2.addCourse(course1);

        // Display students and their courses
        System.out.println("Students and their courses:");
        for (Student student : school.getStudents()) {
            System.out.println(student + " is enrolled in: " + student.getEnrolledCourses());
        }

        // Display courses and their enrolled students
        System.out.println("\nCourses and their enrolled students:");
        System.out.println(course1 + " has students: " + course1.getEnrolledStudents());
        System.out.println(course2 + " has students: " + course2.getEnrolledStudents());
    }
}


// Course class
class Course {
    private String name;
    private List<Student> enrolledStudents;

    public Course(String name) {
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    // Enroll a student in the course
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.addCourse(this); // Ensure bidirectional association
        }
    }

    // Get the list of enrolled students
    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    @Override
    public String toString() {
        return "Course{name='" + name + "'}";
    }
}

// Student class
class Student {
    private String name;
    private List<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    // Add a course to the student's list of courses
    public void addCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.enrollStudent(this); // Ensure bidirectional association
        }
    }

    // Get the list of enrolled courses
    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "'}";
    }
}

// School class
class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Add a student to the school
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Get the list of students
    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "School{name='" + name + "', students=" + students + "}";
    }
}