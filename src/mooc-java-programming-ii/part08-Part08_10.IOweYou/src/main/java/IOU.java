import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> hash;

    public IOU() {
        this.hash = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        hash.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
       return this.hash.getOrDefault(toWhom, 0.0);
    }
}
