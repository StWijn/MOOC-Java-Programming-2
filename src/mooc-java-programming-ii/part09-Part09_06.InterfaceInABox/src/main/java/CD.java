public class CD implements Packable {
    private String artiest;
    private String naam;
    private int jaar;
    private double gewicht;

    public CD(String artiest, String naam, int jaar) {
        this.artiest = artiest;
        this.naam = naam;
        this.jaar = jaar;
        this.gewicht = 0.1;
    }

    @Override
    public String toString() {
        return artiest + ": " + naam + " (" + jaar + ")";
    }

    @Override
    public double weight() {
        return gewicht;
    }
}
