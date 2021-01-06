
public class Main {

    public static void main(String[] args) {
      SimpleDate sim = new SimpleDate(23, 11, 2010);
        SimpleDate sim2 = new SimpleDate(24, 11, 2010);

        System.out.println(sim.hashCode());
        System.out.println(sim2.hashCode());

    }
}
