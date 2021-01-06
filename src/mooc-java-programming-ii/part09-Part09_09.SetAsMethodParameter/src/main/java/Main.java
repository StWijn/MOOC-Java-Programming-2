import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("first");
        names.add("first");
        names.add("second");
        names.add("second");
        names.add("second");

        System.out.println(returnSize(names));
        names.add("jan");
        names.add("Jan");
        names.add("kut");
        names.add("jan");
        names.add("second");
        System.out.println(returnSize(names));
        System.out.println(names.toArray());

    }

    public static int returnSize(Set s) {
        return s.size();
    }

}
