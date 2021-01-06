import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> lijst;

    public ChangeHistory() {
        this.lijst = new ArrayList<>();
    }

    public double maxValue() {
        if (lijst.isEmpty()) {
            return 0;
        }
        double max = lijst.get(0);
        for (double d : lijst) {
            if (d > max)
                max = d;
        }
        return max;
    }

    public double minValue() {
        if (lijst.isEmpty()) {
            return 0;
        }
        double min = lijst.get(0);
        for (double d : lijst) {
            if (d < min)
                min = d;
        }
        return min;
    }

    public double average() {
        if (lijst.isEmpty()) {
            return 0;
        }
        double som = 0;
        for (double d : lijst) {
            som = som + d;
        }
        return som / lijst.size();
    }

    public void add(double status) {
        lijst.add(status);
    }

    public void clear() {
        lijst.clear();
    }

    public String toString() {
        return lijst.toString();
    }
}
