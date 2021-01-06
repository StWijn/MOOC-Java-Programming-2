package FlightControl.domain;

public class Plaats {
    private String plaats;

    public Plaats(String id) {
        this.plaats = id;
    }

    @Override
    public String toString() {
        return this.plaats;
    }
}
