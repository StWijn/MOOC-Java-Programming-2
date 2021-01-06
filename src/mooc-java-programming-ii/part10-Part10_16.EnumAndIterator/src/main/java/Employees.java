import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> lijst;

    public Employees() {
        lijst = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        lijst.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        lijst.addAll(peopleToAdd);
    }

    public void print() {
        Iterator<Person> it = lijst.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> it = lijst.iterator();

        while (it.hasNext())  {
            Person p = it.next();
            if (p.getEducation() == education) {
                System.out.println(p);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> it = lijst.iterator();

        while (it.hasNext())  {

            if (it.next().getEducation() == education) {
                it.remove();
            }
        }
    }


}
