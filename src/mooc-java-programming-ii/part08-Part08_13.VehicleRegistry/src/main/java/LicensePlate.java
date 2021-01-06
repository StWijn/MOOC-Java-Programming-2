public class LicensePlate {

    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }


    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof LicensePlate))
            return false;

        LicensePlate tempObj = (LicensePlate) obj;

        if (this.liNumber.equals(tempObj.liNumber) &&
                this.country.equals(tempObj.country)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int som = 33;
        som = 11 * som + liNumber.hashCode();
        som = 11 * som + country.hashCode();
        return som;
    }

}
