
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //call static "boekMaakMethodje", maakt een AL en lees net zo lang door tot empty String
        ArrayList<Boek> lijst = maakBieb(scanner);

        System.out.println(lijst.size() + " books in total.\n");
        for (Boek b : lijst) {
            System.out.print(b + "\n");
        }


        System.out.println("\n EN NU GESORTEERD \n");


        Comparator<Boek> vergelijker = Comparator.comparing(Boek::getLeeftijdsGrens).thenComparing(Boek::getNaamBoek);

        Collections.sort(lijst, vergelijker);

        System.out.println(lijst.size() + " books in total.");

        System.out.println("");

        System.out.println("Books: ");

        for (Boek b : lijst) {
            System.out.print(b + "\n");
        }

    }


    public static ArrayList<Boek> maakBieb(Scanner lezer) {
        ArrayList<Boek> lijst = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String input = lezer.nextLine();

            if (input.isEmpty()) {
                break;
            }

            System.out.println("Input the age recommendation: ");
            String input2 = lezer.nextLine();

            if (input2.isEmpty()) {
                break;
            }

            int getal = Integer.valueOf(input2);
            lijst.add(new Boek(input, getal));

        }
        return lijst;
    }

}
