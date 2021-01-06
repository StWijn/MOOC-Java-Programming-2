public class TripleTacoBox implements TacoBox {
    private int hoeVeel;

    public TripleTacoBox() {
        this.hoeVeel = 3;
    }


    @Override
    public int tacosRemaining() {
        return hoeVeel;
    }

    @Override
    public void eat() {
        if (hoeVeel > 0)
        this.hoeVeel--;
    }
}
