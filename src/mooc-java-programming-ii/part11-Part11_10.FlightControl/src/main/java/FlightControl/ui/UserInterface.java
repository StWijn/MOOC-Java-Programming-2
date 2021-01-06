package FlightControl.ui;

import FlightControl.domain.*;
import FlightControl.logic.RadioToren;


import java.util.Scanner;

public class UserInterface {
    private RadioToren toren;
    private Scanner lezer;

    public UserInterface(RadioToren toren, Scanner scanner) {
        this.toren = toren;
        this.lezer = scanner;
    }

    public void start() {
        startToevoegen();
        startRadioToren();
    }

    private void startToevoegen() {
        System.out.println("Vloot en vertrek/bestemmingen toevoegen");
        System.out.println("-------------------------------------");
        System.out.println();


        while (true) {
            System.out.println("[1] Voeg toestel toe");
            System.out.println("[2] Voeg vlucht toe");
            System.out.println("[x] Exit menu");

            System.out.println("Keuze: ");
            String input = lezer.nextLine();

            if (input.equals("1")) {
                voegVliegtuig();
            } else if (input.equals("2"))
                voegVlucht();
            else if (input.equals("x"))
                break;
        }
    }

    private void voegVliegtuig() {
        System.out.print("Toestel ID: ");
        String id = lezer.nextLine();
        System.out.print("Maximale passagiers: ");
        int capacity = Integer.parseInt(lezer.nextLine());

        this.toren.addVliegtuig(id, capacity);
    }

    private void voegVlucht() {
        System.out.print("Toestel ID: ");
        Vliegtuig airplane = checkOpVliegtuigID();
        System.out.print("Vertrek: ");
        String departureID = lezer.nextLine();
        System.out.print("Bestemming: ");
        String destinationID = lezer.nextLine();

        this.toren.addVlucht(airplane, departureID, destinationID);
    }

    private void startRadioToren() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();

        while (true) {
            System.out.println("[1] Toon overzicht vliegtuigen");
            System.out.println("[2] Toon overzicht flights");
            System.out.println("[3] Toon airplane details");
            System.out.println("[x] Quit");

            System.out.print("> ");
            String input = lezer.nextLine();
            if (input.equals("1")) {
                printAirplanes();
            } else if (input.equals("2")) {
                printFlights();
            } else if (input.equals("3")) {
                printAirplaneDetails();
            } else if (input.equals("x")) {
                break;
            }
        }
    }

    private void printAirplanes() {
        for (Vliegtuig vliegtuig : toren.getVliegtuigen()) {
            System.out.println(vliegtuig);
        }
    }

    private void printFlights() {
        for (Vlucht flight : toren.getVluchten()) {
            System.out.println(flight);
            System.out.println("");
        }
    }

    private void printAirplaneDetails() {
        System.out.print("Give the airplane id: ");
        Vliegtuig vliegtuig = checkOpVliegtuigID();
        System.out.println(vliegtuig);
        System.out.println();
    }

    private Vliegtuig checkOpVliegtuigID() {
        Vliegtuig vliegtuig = null;
        while (vliegtuig == null) {
            String id = lezer.nextLine();
            vliegtuig = toren.getToestel(id);

            if (vliegtuig == null) {
                System.out.println("Er bestaat geen toestel met dit ID" + id + ".");
            }
        }
        return vliegtuig;
    }
}

