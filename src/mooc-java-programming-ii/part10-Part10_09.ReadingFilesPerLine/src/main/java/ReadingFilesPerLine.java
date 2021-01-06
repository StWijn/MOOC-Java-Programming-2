
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lijst = read("pres.txt");
        System.out.println(lijst);

    }

    public static List<String> read(String bestandsNaam) {
        List<String> lijstje = new ArrayList<>();
        try {
            Files.lines(Paths.get(bestandsNaam)).forEach(rij -> lijstje.add(rij));
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
            e.printStackTrace();
        }
        return lijstje;
    }
}
