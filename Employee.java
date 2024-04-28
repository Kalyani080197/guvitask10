package task10;

public class Employee {
    private int ID;
    private double salary;
    
    // Constructor
    public Employee(int ID, double salary) {
        this.ID = ID;
        this.salary = salary;
    }
    
    // Method to raise salary by a specified percentage
    public void raiseSalary(double percent) {
        // Calculate the raise amount
        double raiseAmount = salary * (percent / 100);
        
        // Update the salary
        salary += raiseAmount;
    }
    
    // Getter for ID
    public int getID() {
        return ID;
    }
    
    // Setter for ID
    public void setID(int ID) {
        this.ID = ID;
    }
    
    // Getter for salary
    public double getSalary() {
        return salary;
    }
    
    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
