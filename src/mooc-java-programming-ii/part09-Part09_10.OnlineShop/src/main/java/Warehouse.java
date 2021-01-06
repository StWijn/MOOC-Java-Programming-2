import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> mapPrijs;
    private Map<String, Integer> mapStock;

    public Warehouse() {
        this.mapPrijs = new HashMap<String, Integer>();
        this.mapStock = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int prijs, int stock) {
        this.mapPrijs.put(product, prijs);
        this.mapStock.put(product, stock);
    }

    public int price(String product) {
        for (String s : mapPrijs.keySet()) {
            if (s.equals(product)) {
                return mapPrijs.get(s);
            }
        }
        return -99;
    }

    public int stock(String product) {
        for (String s : mapStock.keySet()) {
            if (s.equals(product)) {
                return mapStock.get(s);
            }
        }
        return 0;
    }

    public boolean take(String product) {
        if ((!(mapStock.keySet().contains(product))) || mapStock.get(product) == 0) {
            return false;
        }

        Integer i = mapStock.get(product);
        i = i - 1;
        mapStock.put(product, i);
        return true;

    }

    public Set<String> products() {
        Set<String> setjeVanKeys = mapPrijs.keySet();
        return setjeVanKeys;
    }

}