package task10;

public class HerbalTea extends Tea {
    @Override
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing herbal tea with hot water and herbal tea leaves...");
            isPrepared = true;
        } else {
            System.out.println("Herbal tea is already prepared.");
        }
    }
}
