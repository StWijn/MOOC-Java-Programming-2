public class Teacher extends Person {
    private int maandLoon;

    public Teacher (String name, String adres, int loon) {
        super(name, adres);
        maandLoon = loon;
    }

    public String toString() {
        return super.toString() + "\n  salary " + maandLoon + " euro/month";
    }
}
