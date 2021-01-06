public class Dog extends Animal implements NoiseCapable {

    public Dog(String naam) {
        super(naam);
    }

    public Dog() {
        this("Dog");
    }

    @Override
    public void makeNoise() {
        bark();
    }

    public void bark() {
        System.out.println(super.getName() + " barks");
    }
}
