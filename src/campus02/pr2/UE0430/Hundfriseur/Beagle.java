package campus02.pr2.UE0430.Hundfriseur;

public class Beagle extends Dog {

    public Beagle(String name, int haarlaenge) {
        super(name, haarlaenge);
    }

    @Override
    public void makeNoise() {
        System.out.println("Beagle bellt!");
    }


}
