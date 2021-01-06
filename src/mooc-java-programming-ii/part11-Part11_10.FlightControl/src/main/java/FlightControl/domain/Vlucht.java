package FlightControl.domain;

public class Vlucht {
    private Vliegtuig vliegtuig;
    private Plaats vertrek;
    private Plaats bestemming;

    public Vlucht(Vliegtuig vliegtuig, Plaats vertrek, Plaats bestemming) {
        this.vliegtuig = vliegtuig;
        this.vertrek = vertrek;
        this.bestemming = bestemming;
    }

    public Vliegtuig getVliegtuig() {
        return vliegtuig;
    }

    public Plaats getVertrek() {
        return vertrek;
    }

    public Plaats getBestemming() {
        return bestemming;
    }

    @Override
    public String toString() {
        return this.vliegtuig + " (" + this.vertrek + "-" + this.bestemming + ")";
    }
}
