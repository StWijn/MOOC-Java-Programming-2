import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> lijst;

    public Herd() {
        this.lijst = new ArrayList<Movable>();
    }

    public void addToHerd(Movable m) {
        lijst.add(m);
    }

    public void move(int dxx,int dy) {
        for (Movable m : lijst) {
            m.move(dxx, dy);
        }
    }

    public String toString() {
       String s = "";
        for (Movable m : lijst) {
            s = s + m.toString() + "\n";
       }
        return s;
    }
}
