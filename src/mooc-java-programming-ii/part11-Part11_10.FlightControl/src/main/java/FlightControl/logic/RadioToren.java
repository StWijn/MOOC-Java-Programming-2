package FlightControl.logic;

import FlightControl.domain.*;


import java.util.*;

public class RadioToren {
    private Map<String, Vliegtuig> vliegtuigen;
    private Map<String, Vlucht> vluchten;
    private Map<String, Plaats> plaatsen;

    public RadioToren() {
        this.vliegtuigen = new HashMap<>();
        this.vluchten = new HashMap<>();
        this.plaatsen = new HashMap<>();
    }

    public void addVliegtuig(String naam, int capaciteit) {
        Vliegtuig toestel = new Vliegtuig(naam, capaciteit);
        this.vliegtuigen.put(naam, toestel);
    }

    public void addVlucht(Vliegtuig toestel, String vertrek, String aankomst) {
        this.plaatsen.putIfAbsent(vertrek, new Plaats(vertrek));
        this.plaatsen.putIfAbsent(aankomst, new Plaats(aankomst));

        Vlucht vlucht = new Vlucht(toestel, this.plaatsen.get(vertrek), this.plaatsen.get(aankomst));
        this.vluchten.put(vlucht.toString(), vlucht);
    }

    public Collection<Vliegtuig> getVliegtuigen() {
        return this.vliegtuigen.values();
    }

    public Collection<Vlucht> getVluchten() {
        return this.vluchten.values();
    }

    public Vliegtuig getToestel(String naam) {
        return this.vliegtuigen.get(naam);
    }
}
