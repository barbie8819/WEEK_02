package EducationalCourse;

public class OnlineCourse extends Course{
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No");
    }
}
