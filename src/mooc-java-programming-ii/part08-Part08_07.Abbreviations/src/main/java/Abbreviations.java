import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> mapje;

    public Abbreviations() {
        this.mapje = new HashMap<>();
    }

    public void addAbbreviation(String key, String value) {
        mapje.put(key, value);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (mapje.containsKey(abbreviation)) {
            return true;
        }
        /*if (mapje.get(abbreviation) != null) {
            return true;
        }*/
        return false;
    }

    public String findExplanationFor(String abbreviation) {
        return mapje.get(abbreviation);
    }

    public void print() {
        System.out.println(mapje);
        System.out.println("witregel");
        System.out.println(mapje.keySet());
    }


}
