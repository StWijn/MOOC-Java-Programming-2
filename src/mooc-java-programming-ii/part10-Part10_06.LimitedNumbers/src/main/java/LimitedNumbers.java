
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lijst = new ArrayList<>();

        while (true) {
            int i = Integer.valueOf(scanner.nextLine());

            if (i < 0) {
                break;
            }
            lijst.add(i);
        }

        lijst.stream().filter(value -> value >= 1 && value <= 5).forEach(valee -> System.out.println(valee));
    }
}
