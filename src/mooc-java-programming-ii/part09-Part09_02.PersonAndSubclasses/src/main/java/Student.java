public class Student extends Person {
    private int studiepunten;

    public Student(String naam, String adres) {
        super(naam, adres);
        studiepunten = 0;
    }

    public void study() {
        studiepunten++;
    }

    public int credits() {
        return studiepunten;
    }

    public String toString() {
        return super.toString() + "\n  Study credits " + studiepunten;
    }
}