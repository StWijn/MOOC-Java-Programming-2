

public class Main {

    public static void main(String[] args) {
        Item taart = new Item("Taart", 2);
        Item knuffelbeer = new Item("Knuffelbeer", 5);
        Item xbox = new Item("xbox", 3);

        Suitcase koffer = new Suitcase(50);
        koffer.addItem(taart);
        koffer.addItem(knuffelbeer);
        koffer.addItem(xbox);

        System.out.println(koffer);

        Hold opslag = new Hold(80);
        opslag.addSuitcase(koffer);
        System.out.println("Witregel\n");
        opslag.printItems();

        System.out.println("\nNog een witregel \n");

        opslag.streamPrint();
    }

}
