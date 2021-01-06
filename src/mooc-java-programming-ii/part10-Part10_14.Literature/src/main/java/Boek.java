public class Boek {
    String naamBoek;
    int leeftijdsGrens;

    public Boek(String naamBoek, int leeftijdsGrens) {
        this.naamBoek = naamBoek;
        this.leeftijdsGrens = leeftijdsGrens;
    }

    public String getNaamBoek() {
        return naamBoek;
    }

    public int getLeeftijdsGrens() {
        return leeftijdsGrens;
    }

    public String toString() {
        return naamBoek + " (recommended for " + leeftijdsGrens + " year-olds or older)";
    }
}
