import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> lijst = new ArrayList<>();

    public void add(Card card) {
        lijst.add(card);
    }
    public void print() {
        lijst.forEach(c -> System.out.println(c));
    }

    public void sortBySuit() {
        BySuitInValueOrder sorteer = new BySuitInValueOrder();
        Collections.sort(lijst, sorteer);
    }

    public void sort() {
        Collections.sort(lijst);
    }

    @Override
    public int compareTo(Hand o) {
       int i = 0;
       for (Card c : lijst) {
           i = i + c.getValue();
       }
       int y = 0;
       for (Card c : o.lijst) {
           y = y + c.getValue();
       }
       return i - y;
    }
}
