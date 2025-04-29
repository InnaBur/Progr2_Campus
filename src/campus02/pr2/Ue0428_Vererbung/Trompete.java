package campus02.pr2.Ue0428_Vererbung;

public class Trompete extends Instrument {
    public Trompete(int lautstaerke) {
        super(lautstaerke);
    }

    @Override
    public int play() {
        System.out.println(this.getClass().getSimpleName() + " wird geschlagen");
        return super.getLautstaerke();
    }
}
