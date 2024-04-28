package task10;

public class CheckCircumference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Create a Circle object using the no-argument constructor
        Circle circle1 = new Circle();
        
        // Display the radius and circumference of circle1
        System.out.println("Radius of circle1: " + circle1.getRadius());
        System.out.println("Circumference of circle1: " + circle1.calculateCircumference());
        
        // Create a Circle object using the parameterized constructor
        Circle circle2 = new Circle(3.5);
        
        // Display the radius and circumference of circle2
        System.out.println("Radius of circle2: " + circle2.getRadius());
        System.out.println("Circumference of circle2: " + circle2.calculateCircumference());

	}

}
