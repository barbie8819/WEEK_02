package EducationalCourse;

public class CourseHierarchy {
    public static void main(String[] args) {
        Course course = new Course("Intro to Java", 6);
        OnlineCourse onlineCourse = new OnlineCourse("Java for Beginners", 6, "Udemy", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Advanced Java", 8, "Coursera", true, 200, 15);

        System.out.println(course.displayInfo());
        System.out.println(onlineCourse.displayInfo());
        System.out.println(paidOnlineCourse.displayInfo());
    }
}
