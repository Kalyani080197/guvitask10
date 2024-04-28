package task10;

public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an Employee object
        Employee employee = new Employee(1001, 50000);
        
        // Display initial salary
        System.out.println("Initial salary: $" + employee.getSalary());
        
        // Raise salary by 10%
        employee.raiseSalary(10);
        
        // Display updated salary
        System.out.println("Updated salary: $" + employee.getSalary());

	}

}
