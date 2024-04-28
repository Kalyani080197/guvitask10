package task10;

public class Circle {
    private double radius;
    
    // No-argument constructor
    public Circle() {
        // Default radius is set to 1
        this.radius = 1.0;
    }
    
    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Method to calculate the circumference
    public double calculateCircumference() {
        // Circumference formula: 2 * π * radius
        return 2 * Math.PI * radius;
    }
    
    // Getter for radius
    public double getRadius() {
        return radius;
    }
    
    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
