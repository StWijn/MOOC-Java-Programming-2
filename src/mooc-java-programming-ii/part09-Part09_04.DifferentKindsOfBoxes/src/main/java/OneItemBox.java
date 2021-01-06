import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> lijst = new ArrayList<>();

    public OneItemBox() {
    }

    @Override
    public void add(Item item) {
        if (lijst.size() == 0)
            lijst.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return lijst.contains(item);
    }
}