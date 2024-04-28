package task10;

public class GreenTea extends Tea {
    @Override
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing green tea with hot water and green tea leaves...");
            isPrepared = true;
        } else {
            System.out.println("Green tea is already prepared.");
        }
    }
}