
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Book> readBooks(String file) {
        List<Book> boekenLijst = new ArrayList<>();

        try {
            Files.lines(Paths.get(file))
                    .map(rijtje -> rijtje.split(","))
                    .filter(rij -> rij.length == 4)
                    .map(boekje -> new Book(boekje[0], Integer.valueOf(boekje[1]), Integer.valueOf(boekje[2]), boekje[3]))
                    .forEach(finalBoek -> boekenLijst.add(finalBoek));

        } catch (Exception exc) {
            System.out.println("Foutmelding!");
            exc.printStackTrace();
        }
        return boekenLijst;
    }

}
