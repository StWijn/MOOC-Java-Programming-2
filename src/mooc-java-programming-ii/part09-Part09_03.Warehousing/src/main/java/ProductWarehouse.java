public class ProductWarehouse extends Warehouse {
    private String naam;

    public ProductWarehouse(String naam, double capacity) {
        super(capacity);
        this.naam = naam;
    }

    public String getName() {
        return naam;
    }

    public String toString() {
        return this.getName() + ": " + super.toString();
    }

    public void setName(String naam) {
        this.naam = naam;
    }
}
