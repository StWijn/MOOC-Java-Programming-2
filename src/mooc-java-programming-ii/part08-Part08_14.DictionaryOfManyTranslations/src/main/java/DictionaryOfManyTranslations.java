import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> mapje;

    public DictionaryOfManyTranslations() {
        this.mapje = new HashMap<>();
    }

    public void add(String woord, String vertaling) {
        this.mapje.putIfAbsent(woord, new ArrayList<>());
        mapje.get(woord).add(vertaling);
    }

    public ArrayList<String> translate(String woord) {
        if (mapje.containsKey(woord)) {
            return this.mapje.get(woord);
        } else {
            return new ArrayList<>();
        }
    }

    public void remove(String woord) {
        if (mapje.containsKey(woord)) {
            mapje.remove(woord);
        }
    }

}
