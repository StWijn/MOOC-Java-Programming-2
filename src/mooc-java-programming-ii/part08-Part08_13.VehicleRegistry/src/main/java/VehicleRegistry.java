import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> map;

    public VehicleRegistry() {
        this.map = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!map.containsKey(licensePlate)) {
            map.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        System.out.println("Dit kenteken is van: ");
        return map.getOrDefault(licensePlate, "niet geregistreerd!");
    }

    public boolean remove(LicensePlate licensePlate) {
        if (map.containsKey(licensePlate)) {
            map.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate l : map.keySet()) {
            System.out.println(l);
        }
    }

    public void printOwners() {
        ArrayList<String> lijst = new ArrayList<>();

        for (String o : map.values()) {
            if (!lijst.contains(o)) {
                System.out.println(o);
                lijst.add(o);
            }
        }
    }
}
