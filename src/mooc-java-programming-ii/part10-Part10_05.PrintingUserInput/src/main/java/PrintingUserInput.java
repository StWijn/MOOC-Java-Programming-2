
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lijst = new ArrayList<>();

        while (true) {
            System.out.println("Hallo");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            lijst.add(input);
        }

        lijst.stream().forEach(waarde -> System.out.println(waarde));

    }
}
