
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        Random r = new Random();

        while (this.numbers.size() != 7) {
            int x = r.nextInt(40) + 1;

            if (!containsNumber(x)) {
                this.numbers.add(x);
            }
        }
        // Implement the random number generation here
        // the method containsNumber is probably useful
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }

}

