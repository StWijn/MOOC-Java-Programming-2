
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many random numbers should be printed?");
        String input = scanner.nextLine();
        int getal = Integer.valueOf(input);

        Random willekeurig = new Random();

        for (int i = 0; i < getal; i++) {
            System.out.println(willekeurig.nextInt(11));
        }
    }

}
