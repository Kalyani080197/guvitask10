package task10;


public class Person {
    private String name;
    private int age;
    
    // Default constructor
    public Person() {
        // Initialize attributes with default values
        this.name = "";
        this.age = 0;
    }
    
    // Parameterized constructor
    public Person(String name, int age) {
        // Initialize attributes with provided values
        this.name = name;
        this.age = age;
    }
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter for age
    public int getAge() {
        return age;
    }
    
    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}