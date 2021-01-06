package FlightControl;


import FlightControl.logic.RadioToren;
import FlightControl.ui.UserInterface;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner lezer = new Scanner(System.in);
        RadioToren toren = new RadioToren();

        UserInterface ui = new UserInterface(toren, lezer);
        ui.start();
    }
}
