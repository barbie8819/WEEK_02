    // Main method for testing
	public class CircleClass{
    public static void main(String[] args) {
        // Using default constructor
        Circle defaultCircle = new Circle();
        defaultCircle.displayDetails();

        System.out.println();

        // Using parameterized constructor
        Circle customCircle = new Circle(5.0);
        customCircle.displayDetails();
    }
}
 class Circle {
    // Attribute
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Default radius is 1.0
    }

    // Parameterized constructor
    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 1.0; // Default to 1.0 if an invalid radius is provided
        }
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive. Keeping the current value.");
        }
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display circle details
    public void displayDetails() {
        System.out.println("Circle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}
 
