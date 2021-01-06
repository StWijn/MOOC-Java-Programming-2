
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");

    }

    public static void printKeysWhere(HashMap<String, String> hash, String text) {
        for (String s : hash.keySet()) {
            if (s.contains(text)) {
                System.out.println(s);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hash, String text) {
        for (String s : hash.keySet()) {
            if (s.contains(text)) {
                System.out.println(hash.get(s));
            }
        }
    }



    public static void printKeys(HashMap<String, String> hash) {
        for (String s : hash.keySet()) {
            System.out.println(s);
        }
    }

}
