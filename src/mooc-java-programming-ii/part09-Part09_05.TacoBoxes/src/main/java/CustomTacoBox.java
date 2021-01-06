public class CustomTacoBox implements TacoBox{
    private int hoeVeel;

    public CustomTacoBox(int tacos) {
        this.hoeVeel = tacos;
    }


    @Override
    public int tacosRemaining() {
        return hoeVeel;
    }

    @Override
    public void eat() {
        if (hoeVeel > 0)
        hoeVeel--;
    }
}
