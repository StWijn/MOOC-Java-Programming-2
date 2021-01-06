import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMap_obvAL<K, V> {
    private ArrayList<Paar<K, V>>[] al;
    private int freeIndex;

    public HashMap_obvAL() {
        this.al = new ArrayList[20];
        this.freeIndex = 0;
    }

    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.al.length);
        if (this.al[hashValue] == null) {
            return null;
        }

        ArrayList<Paar<K, V>> HMopIndex = this.al[hashValue];

        for (int i = 0; i < HMopIndex.size(); i++) {
            if (HMopIndex.get(0).getKey().equals(key)) {
                return HMopIndex.get(i).getValue();
            }
        }

        return null;
    }

    public void add(K key, V value) {
        ArrayList<Paar<K, V>> values = getListobvKey(key);
        int index = getIndexobvKey(values, key);

        if (index < 0) {
            System.out.println("Key nog niet eerder opgegeven, plaatsen nieuw key/value paar");
            values.add(new Paar<>(key, value));
            this.freeIndex++;
        } else {
            System.out.println("Key reeds eerder opgegeven, verwijderen oude value en plaatsen nieuwe value");
            values.get(index).setValue(value);
        }
    }

    private ArrayList<Paar<K, V>> getListobvKey(K key) {
        int hashValue = Math.abs(key.hashCode() % al.length);
        if (this.al[hashValue] == null) {
            this.al[hashValue] = new ArrayList<>();
        }

        return this.al[hashValue];
    }

    private int getIndexobvKey(ArrayList<Paar<K, V>> lijst, K key) {
        for (int i = 0; i < lijst.size(); i++) {
            if (lijst.get(0).getKey().equals(key)) {
                return i;
            }
        }

        return -1;
    }

    /*  werkt nog niet!

    public V remove(K key) {
        ArrayList<Paar<K, V>> values = getListobvKey(key);
        if (values.size() == 0 || values == null) {
            return null;
        }

        int index = getIndexobvKey(values, key);
        if (index < 0) {
            System.out.println("Key niet gevonden");
            return null;
        }

        Paar<K, V> paar = values.get(index);



    }
    */


}
