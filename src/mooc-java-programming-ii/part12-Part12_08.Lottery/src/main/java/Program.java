
import java.util.ArrayList;
import java.util.Random;

public class Program {

    public static void main(String[] args) {
        LotteryRow row = new LotteryRow();
        ArrayList<Integer> lotteryNumbers = row.numbers();

        System.out.println("Lottery numbers:");
        for (Integer number : lotteryNumbers) {
            System.out.print(number + " ");
        }
        System.out.println("");

        System.out.println("hallo");
        Random r = new Random();
        System.out.println(r.nextDouble());
    }
}

