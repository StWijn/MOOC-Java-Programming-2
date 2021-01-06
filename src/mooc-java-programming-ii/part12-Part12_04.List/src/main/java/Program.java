public class Program {

    public static void main(String[] args) {

        List lijst = new List();

        lijst.add("Hallo");
        System.out.println(lijst.grootte());

        System.out.println(lijst.returnWaarde(0));

        lijst.add(new Object());

        System.out.println(lijst.returnWaarde(1));

    }

}
