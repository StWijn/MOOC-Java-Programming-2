public class Cat extends Animal implements NoiseCapable{

    public Cat(String naam) {
        super(naam);
    }

    public Cat() {
        this("Cat");
    }

    @Override
    public void makeNoise() {
        purr();
    }

    public void purr() {
        System.out.println(super.getName() + " purrs");
    }
}
