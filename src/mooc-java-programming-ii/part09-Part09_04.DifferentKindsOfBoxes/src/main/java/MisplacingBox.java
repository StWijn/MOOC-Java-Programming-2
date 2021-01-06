import java.util.ArrayList;

public class MisplacingBox extends Box  {

    private ArrayList<Item> lijst = new ArrayList<>();

    public MisplacingBox() {}

    @Override
    public void add(Item item) {
        lijst.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
