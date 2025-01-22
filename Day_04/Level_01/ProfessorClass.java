import java.util.ArrayList;
import java.util.List;

public class ProfessorClass {
    public static void main(String[] args) {
        // Create professors
        Professor professor1 = new Professor("Dr. Sumit", "Computer Science");
        Professor professor2 = new Professor("Dr. Amit", "Mathematics");

        // Create students
        Student student1 = new Student("Kumar", 20);
        Student student2 = new Student("Rao", 22);

        // Create courses
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Calculus");

        // Assign professors to courses
        professor1.teachCourse(course1);
        professor2.teachCourse(course2);

        // Students enroll in courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course1);
        student2.enrollCourse(course2);

        // Display course details
        System.out.println("\nCourse Details:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        // Display enrolled courses for each student
        System.out.println("\nStudent Course Enrollment:");
        student1.displayEnrolledCourses();
        student2.displayEnrolledCourses();
    }
}

class Course {
    private String courseName;
    private Professor professor;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.professor = null; // Initially, no professor is assigned
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println(professor.getName() + " has been assigned to teach " + this.courseName + ".");
    }

    public void enrollStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " has enrolled in " + this.courseName + ".");
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        }
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

class Professor {
    private String name;
    private String department;

    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void teachCourse(Course course) {
        course.assignProfessor(this);
    }
}

class Student {
    private String name;
    private int age;
    private List<Course> enrolledCourses;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        course.enrollStudent(this);
        enrolledCourses.add(course);
    }

    public void displayEnrolledCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course course : enrolledCourses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}