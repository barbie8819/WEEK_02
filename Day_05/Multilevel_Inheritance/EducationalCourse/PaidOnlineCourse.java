package EducationalCourse;

public class PaidOnlineCourse extends OnlineCourse{
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public String displayInfo() {
        double discountedPrice = fee - (fee * discount / 100);
        return super.displayInfo() + ", Fee: $" + fee + ", Discount: " + discount + "%, Price after discount: $" + discountedPrice;
    }
}
