package task10;

public class Tea {
    public boolean isPrepared;
    public boolean hasMilk;
    public boolean hasSugar;

    // Constructor
    public Tea() {
        this.isPrepared = false;
        this.hasMilk = false;
        this.hasSugar = false;
    }

    // Method to prepare tea with hot water and tea leaves
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing tea with hot water and tea leaves...");
            isPrepared = true;
        } else {
            System.out.println("Tea is already prepared.");
        }
    }

    // Method to add milk to basic tea
    public void addMilk() {
        if (!hasMilk) {
            if (isPrepared) {
                System.out.println("Adding milk to the tea...");
                hasMilk = true;
            } else {
                System.out.println("Tea needs to be prepared first.");
            }
        } else {
            System.out.println("Milk is already added to the tea.");
        }
    }

    // Method to add sugar to basic tea
    public void addSugar() {
        if (!hasSugar) {
            if (isPrepared) {
                System.out.println("Adding sugar to the tea...");
                hasSugar = true;
            } else {
                System.out.println("Tea needs to be prepared first.");
            }
        } else {
            System.out.println("Sugar is already added to the tea.");
        }
    }
}