package Task6;

public class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this.radius = 1.0;  // Default radius
    }

    // Constructor with radius parameter
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;  // Formula: 2πr
    }

    // Getter method
    public double getRadius() {
        return radius;
    }

    // Display circle details
    public void displayCircleDetails() {
        System.out.println("Circle with radius: " + radius);
        System.out.println("Circumference: " + calculateCircumference());
    }
}
