import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> map;

    public ShoppingCart() {
        this.map = new HashMap<>();
    }

    public void add(String product, int price) {
        if (map.containsKey(product)) {
            map.get(product).increaseQuantity();
        } else {
            map.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int totaal = 0;
        for (Item item : map.values()) {
            totaal = totaal + item.price();
        }
        return totaal;
    }

    public void print() {
        for (Item i : map.values()) {
            System.out.println(i);
        }
    }
}