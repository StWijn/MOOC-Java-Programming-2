public class Person {
    private String naam;
    private Education edu;

    public Person(String naam, Education opleiding) {
        this.naam = naam;
        this.edu = opleiding;
    }

    public Education getEducation() {
        return this.edu;
    }

    public String toString() {
        return naam + ", " + edu;
    }
}
