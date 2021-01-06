import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> mapje;

    public StorageFacility() {
        this.mapje = new HashMap<>();
    }

    public void add(String unit, String item) {
        mapje.putIfAbsent(unit, new ArrayList<>());

        ArrayList<String> tempLijst = mapje.get(unit);
        tempLijst.add(item);
    }

    public ArrayList<String> contents(String unit) {
        return this.mapje.getOrDefault(unit, new ArrayList<String>());
    }

    public void remove(String unit, String item) {
        ArrayList<String> temp = mapje.get(unit);
        temp.remove(item);
        if (temp.isEmpty()) {
            mapje.remove(unit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> temp = new ArrayList<>();
        for (String obj : mapje.keySet()) {
            temp.add(obj);
        }
        return temp;
    }
}


