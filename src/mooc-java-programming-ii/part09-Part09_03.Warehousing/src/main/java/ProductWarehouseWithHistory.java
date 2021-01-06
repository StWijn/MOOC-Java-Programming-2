public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory ch;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        ch = new ChangeHistory();
        ch.add(initialBalance);
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        ch.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double d = super.takeFromWarehouse(amount);
        ch.add(super.getBalance());
        return d;
    }

    public String history() {
        return ch.toString();
    }

    public void printAnalysis() {
        String s = "Product: " + super.getName() +
                "\nHistory: " + ch +
                "\nLargest amount of product: " + ch.maxValue() +
                "\nSmallest amount of product: " + ch.minValue() +
                "\nAverage: " + ch.average();
        System.out.println(s);
    }
}
