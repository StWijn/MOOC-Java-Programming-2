package title;

import java.util.Scanner;
import javafx.application.Application;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bedenk een naam voor de applicatie en druk op enter");

        String input = scanner.nextLine();

        Application.launch(UserTitle.class,"--titel=" + input);

    }

}
