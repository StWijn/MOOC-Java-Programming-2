package validating;

public class Person {

    public static void main(String[] args) {
        Person p = new Person("Hendriiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiik",21);
    }

    private String name;
    private int age;

    public Person(String name, int age) {
// The constructor of the class Person should
// ensure that the name given as the parameter is not null, empty, or over 40 characters in length.
       if (name == null || name.isEmpty() || name.length() > 40 || (age < 0 || age > 120))
           throw new IllegalArgumentException("Naam kan niet null of leeg zijn, en moet binnen de 40 characters blijven. Iemand jonger dan 0 jaar of ouder dan 120 jaar bestaat niet, grapjas!");

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
