
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lijstje = new ArrayList<>();
        System.out.println("Input numbers, type 'end' to stop.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            lijstje.add(input);
        }
        long hoeveelOpLijstje = lijstje.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .count();

        System.out.println("Hoeveel: " + hoeveelOpLijstje);

        double average = lijstje.stream().mapToInt(a -> Integer.valueOf(a)).average().getAsDouble();
        System.out.println("Average of the numbers: " + average);

    }
}
