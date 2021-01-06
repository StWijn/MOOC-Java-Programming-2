public class Book implements Packable{
    private String auteur;
    private String naam;
    private double gewicht;

    public Book(String auteur, String naam, double gewicht) {
        this.auteur = auteur;
        this.naam = naam;
        this.gewicht = gewicht;
    }

    public String toString() {
        return auteur + ": " + naam;
    }

    @Override
    public double weight() {
        return gewicht;
    }
}
