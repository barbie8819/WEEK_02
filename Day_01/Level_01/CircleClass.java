import java.util.Scanner;

public class CircleClass {
    public static void main(String[] args) {
        // Create a Circle object with a radius of 7
        Circle circle = new Circle(7);

        // Display area details
        circle.display();
    }
}

class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.pow(radius, 2) * 22 / 7; // π ≈ 22/7
    }

    // Method to display the area of the circle
    public void display() {
        System.out.println("Area of the circle: " + calculateArea());
    }
}
