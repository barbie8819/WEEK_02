package EducationalCourse;

public class Course {
    protected String courseName;
    protected int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String displayInfo() {
        return "Course: " + courseName + ", Duration: " + duration + " weeks";
    }
}
