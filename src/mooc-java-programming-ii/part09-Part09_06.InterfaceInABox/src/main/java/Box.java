import java.util.ArrayList;

public class Box implements Packable {
    private ArrayList<Packable> lijst;
    private double capaciteit;

    public Box(double capa) {
        this.lijst = new ArrayList<>();
        this.capaciteit = capa;
    }

    public double gewichtVanLijst(ArrayList<Packable> obj) {
        double som = 0;
        for (Packable o : obj) {
            som = som + o.weight();
        }
        return som;
    }

    public double weight() {
        double weight = 0;
        for (Packable p : lijst) {
            weight = weight + p.weight();
        }
        return weight;
    }

    public void add(Packable p) {
        if (gewichtVanLijst(lijst) + p.weight() <= capaciteit)
            lijst.add(p);
    }

    public String toString() {
        return "Box: " + lijst.size() + " items, total weight " + this.gewichtVanLijst(lijst) + " kg";
    }

}
