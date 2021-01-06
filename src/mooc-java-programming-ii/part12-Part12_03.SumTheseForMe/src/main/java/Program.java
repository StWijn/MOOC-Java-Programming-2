
import java.util.Scanner;

public class Program {

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        if (fromWhere < 0) {
            fromWhere = 0;
        }
        if (toWhere > array.length) {
            toWhere = array.length;
        }

        int som = 0;

        for (int i = fromWhere; i < toWhere; i++) {
            if (array[i] >= smallest && array[i] <= largest) {
                som = som + array[i];
            }
        }
        return som;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));

        System.out.println("Witregel \n");

        int[] numbers2 = {8, -2, 3, 1, 1, 1, 2, 3};
        System.out.println(sum(numbers2, 5, numbers2.length, 0, 999));

    }

}
