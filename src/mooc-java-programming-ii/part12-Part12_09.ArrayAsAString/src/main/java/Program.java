
public class Program {



    public static String arrayAsString(int[][] array) {
        StringBuilder bouwer = new StringBuilder();

        for (int rij = 0; rij < array.length; rij++) {
            for (int kolom = 0; kolom < array[rij].length; kolom++) {
                bouwer.append(array[rij][kolom]);
            }
            bouwer.append("\n");
        }

        return bouwer.toString();

    }

    public static void main(String[] args) {

        int[][] matrix = {
                {9, 0, 3, 6},
                {249, 4, 1, 0},
                {3, 21, 88, 0}
        };

        System.out.println(arrayAsString(matrix));

        Number []nums = new Number[4];
// assign derived class objects
        nums[0] = (byte) 10;
        nums[1] = new Integer(10);
        nums[2] = new Float(10);
        nums[3] = new Double(10.0);
    }



}
