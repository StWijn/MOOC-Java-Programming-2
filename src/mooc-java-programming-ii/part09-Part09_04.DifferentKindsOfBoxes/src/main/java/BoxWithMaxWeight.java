import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private ArrayList<Item> lijst;
    private int capaciteit;

    public BoxWithMaxWeight(int capacity) {
        this.capaciteit = capacity;
        this.lijst = new ArrayList<>();
        }

    @Override
    public void add(Item item) {
       int huidigGewicht = 0;
       for (Item i : lijst) {
           huidigGewicht = huidigGewicht + i.getWeight();
       }

        if (!((item.getWeight() + huidigGewicht) > capaciteit)) {
           lijst.add(item);
       }
    }

    @Override
    public boolean isInBox(Item item) {
        return lijst.contains(item);
    }
}
