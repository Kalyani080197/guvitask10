package task10;

public class BlackTea extends Tea {
    @Override
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing black tea with hot water and black tea leaves...");
            isPrepared = true;
        } else {
            System.out.println("Black tea is already prepared.");
        }
    }
}