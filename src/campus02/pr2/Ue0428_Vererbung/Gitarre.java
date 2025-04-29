package campus02.pr2.Ue0428_Vererbung;

public class Gitarre extends Instrument {
    public Gitarre(int lautstaerke) {
        super(lautstaerke);
    }

    @Override
    public int play() {
        System.out.println(this.getClass().getSimpleName() + " wird gespielt");
        return super.getLautstaerke();
    }
}
