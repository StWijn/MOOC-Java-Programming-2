
import java.util.HashMap;

public class Nicknames {
// matthew's nickname is matt
//michael's nickname is mix
//arthur's nickname is artie
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("matt", "matthew");
        map.put("mix", "michael");
        map.put("artie", "arthur");

        String matthewsNaam = map.get("matt");
        System.out.println(matthewsNaam);

    }

}
