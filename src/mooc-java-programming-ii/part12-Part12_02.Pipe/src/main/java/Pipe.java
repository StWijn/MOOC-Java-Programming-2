import java.util.ArrayList;

public class Pipe<T> {
    private ArrayList<T> lijst;

    public Pipe() {
        this.lijst = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        lijst.add(value);
    }

    public T takeFromPipe() {
        if (lijst.isEmpty()) {
            return null;
        }

        T obj = lijst.get(0);
        lijst.remove(0);
        return obj;
    }

    public boolean isInPipe() {
        return lijst.size() != 0;
    }

}
