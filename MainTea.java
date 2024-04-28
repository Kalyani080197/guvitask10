package task10;

public class MainTea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Create a Tea object
        Tea tea = new Tea();

        // Prepare tea
        tea.prepareTea();

        // Add milk
        tea.addMilk();

        // Add sugar
        tea.addSugar();
        
     // Create instances of tea subclasses
        BlackTea blackTea = new BlackTea();
        GreenTea greenTea = new GreenTea();
        HerbalTea herbalTea = new HerbalTea();

        // Prepare different types of tea
        blackTea.prepareTea();
        greenTea.prepareTea();
        herbalTea.prepareTea();

	}

}
