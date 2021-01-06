package application;

import java.util.*;

public class WoordenBoek {

    private Map<String, String> mapje;
    private List<String> lijstje;

    public WoordenBoek() {
        this.mapje = new HashMap<String, String>();
        this.lijstje = new ArrayList<String>();

        // this.add("practice question", "oefenvraag");
    }

    public void add(String woord, String vertaling) {
        if (!this.mapje.containsKey(woord)) {
            this.lijstje.add(woord);
        }

        this.mapje.put(woord, vertaling);
    }

    public String get(String word) {
        return this.mapje.get(word);
    }

    public String getRandom() {
        Random random = new Random();
        String woord = lijstje.get(random.nextInt(lijstje.size()));
        return woord;
    }

    public int getSizeLijst() {
        return this.lijstje.size();
    }
}
