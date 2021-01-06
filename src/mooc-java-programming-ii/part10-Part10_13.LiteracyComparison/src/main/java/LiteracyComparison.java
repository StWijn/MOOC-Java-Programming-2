
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<LandStatistieken> statistieken = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try (Scanner reader = new Scanner(Paths.get("literacy.csv"))) {

            while (reader.hasNextLine()) {
                String zin = reader.nextLine();

                String[] arr = zin.split(",");
                if (arr[2].contains("female")) {
                    arr[2] = "female";
                } else {
                    arr[2] = "male";
                }
                statistieken.add(new LandStatistieken(arr[3], Integer.valueOf(arr[4]), arr[2], Double.valueOf(arr[5])));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


       //mbv stream
        statistieken.stream().sorted((o1, o2) -> {
            if (o1.score() > o2.score()) {
                return 1;
            }
            if (o1.score() < o2.score()) {
                return -1;
            } else {
                return 0;
            }
        }).forEach(o -> System.out.println(o.toString()));

        System.out.println(" \n WITREGEL \n");

        //mbv Collections
        Collections.sort(statistieken, (l1, l2) -> {
            if (l1.score() > l2.score()) {
                return 1;
            } if (l1.score() < l2.score()) {
                return -1;
            } else {
                return 0;
            }
        });

        statistieken.forEach(l -> System.out.println(l));


    }


}
