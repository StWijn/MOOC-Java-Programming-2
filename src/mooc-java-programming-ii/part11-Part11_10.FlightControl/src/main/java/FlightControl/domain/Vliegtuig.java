package FlightControl.domain;

public class Vliegtuig {
    private String naam;
    private int capaciteit;

    public Vliegtuig(String naam, int plek) {
        this.naam = naam;
        this.capaciteit = plek;
    }

    public String getNaam() {
        return this.naam;
    }

    public int getCapaciteit() {
        return this.capaciteit;
    }

    @Override
    public String toString() {
        return this.naam + " (" + this.capaciteit + " reizigers)";
    }
}
