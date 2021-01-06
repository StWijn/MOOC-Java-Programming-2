
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(this instanceof Item)) {
            return false;
        }
        Item temp = (Item) o;

        if (name.equals(temp.name)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int som = 9;
        som = 23 * som + name.hashCode();
        return som;
    }


}
