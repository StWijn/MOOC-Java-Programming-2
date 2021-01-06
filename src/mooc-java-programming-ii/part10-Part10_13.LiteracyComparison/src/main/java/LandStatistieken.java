public class LandStatistieken {
    String land;
    int jaartal;
    String geslacht;
    double score;

    public LandStatistieken(String land, int jaar, String geslacht, double score) {
        this.land = land;
        this.jaartal = jaar;
        this.geslacht = geslacht;
        this.score = score;
    }

    public String toString() {
        // Niger (2015), female, 11.01572
        return this.land + " (" + jaartal + "), " + geslacht + ", " + score;
    }

    public double score() {
        return this.score;
    }
}


