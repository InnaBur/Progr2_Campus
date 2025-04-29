package campus02.pr2.Ue0428_Vererbung;

public abstract class Instrument {

    private int lautstaerke;

    public Instrument(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }

    public abstract int play();


    public int getLautstaerke() {
        return lautstaerke;
    }
}
