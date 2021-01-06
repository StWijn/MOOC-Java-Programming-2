public abstract class Animal {
    private String naam;

    public Animal(String name) {
        naam = name;
    }

    public void eat() {
        System.out.println(naam + " eats");
    }

    public void sleep() {
        System.out.println(naam + " sleeps");
    }

    public String getName() {
        return naam;
    }
}
