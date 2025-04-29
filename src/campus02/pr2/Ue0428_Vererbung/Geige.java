package campus02.pr2.Ue0428_Vererbung;

public class Geige extends Instrument {
    public Geige(int lautstaerke) {
        super(lautstaerke);
    }

    @Override
    public int play() {
        System.out.println(this.getClass().getSimpleName() + " wird gestrichen");
        return super.getLautstaerke();
    }
}
