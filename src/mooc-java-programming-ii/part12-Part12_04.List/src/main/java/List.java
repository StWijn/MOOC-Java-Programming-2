public class List<Type> {
    private Type[] lijst;
    private int teller;

    public List() {
        this.lijst = (Type[]) new Object[10];
        this.teller = 0;
    }

    public void add(Type var) {
        if (this.lijst.length == this.teller) {
            grow();
        }
        this.lijst[teller] = var;
        this.teller++;
    }

    public boolean contains(Type var) {
        return indexVanVar(var) >= 0;
    }

    public Type returnWaarde(int index) {
        if (index < 0 || index > this.teller) {
            throw new IndexOutOfBoundsException("Kan niet! Opgegeven index valt buiten de huidige [0, " + this.teller + "] range");
        }
        return this.lijst[index];
    }


    public int grootte() {
        return this.teller;
    }

    public void grow() {
        int nieuweGrootte = this.lijst.length + this.lijst.length / 2;
        Type[] nieuweLijst = (Type[]) new Object[nieuweGrootte];

        for (int i = 0; i <= this.lijst.length; i++)
            nieuweLijst[i] = this.lijst[i];

        this.lijst = nieuweLijst;
    }

    public void remove(Type var) {
        int index = indexVanVar(var);
        if (index < 0) {
            System.out.println("Niet gevonden");
            return;
        }

        verschuifIndex(index);
        this.teller--;
    }

    private int indexVanVar(Type var) {
        for (int i = 0; i < this.teller; i++) {
            if (this.lijst[i].equals(var) || this.lijst[i] == var) {
                return i;
            }
        }
        return -1;
    }

    private void verschuifIndex(int index) {
        for (int i = index; i < this.teller - 1; i++) {
            this.lijst[i] = this.lijst[i + 1];
        }
    }
}

