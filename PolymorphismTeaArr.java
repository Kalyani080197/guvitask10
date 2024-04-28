package task10;

public class PolymorphismTeaArr {
	
	public static void main(String[] args) {
        // Create an array of Tea objects
        Tea[] teas = new Tea[4];

        // Initialize array elements with instances of Tea and its subclasses
        teas[0] = new Tea();
        teas[1] = new BlackTea();
        teas[2] = new GreenTea();
        teas[3] = new HerbalTea();

        // Loop through the array and call the prepareTea method
        for (int i = 0; i < teas.length; i++) {
            teas[i].prepareTea();
        }
    }


}
