
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers, type \"end\" to stop.");
        ArrayList<String> lijst = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            lijst.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input2 = scanner.nextLine();

        if (input2.equals("n")) {
            System.out.println("Average of the negative numbers: " + lijst.stream().mapToInt(xxx -> Integer.valueOf(xxx)).filter(x -> x < 0).average().getAsDouble());
        } else if (input2.equals("p")) {
            System.out.println("Average of the positive numbers: " + lijst.stream().mapToInt(xxx -> Integer.valueOf(xxx)).filter(x -> x >= 0).average().getAsDouble());
        }
    }
}
