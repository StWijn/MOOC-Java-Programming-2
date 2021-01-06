import java.util.HashMap;
import java.util.Map;

public class Item {
    private String naam;
    private int hoeveel;
    private int prijs;

    public Item(String product, int qty, int unitPrice) {
        naam = product;
        hoeveel = qty;
        prijs = unitPrice;
    }

    public int price() {
        return prijs * hoeveel;
    }

    public int lossePrijs() {
        return prijs;
    }

    public void increaseQuantity(){
        hoeveel++;
    }

    public String toString() {
        return naam + ": " + hoeveel;
    }
}