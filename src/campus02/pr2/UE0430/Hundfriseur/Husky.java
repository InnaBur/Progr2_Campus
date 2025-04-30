package campus02.pr2.UE0430.Hundfriseur;

public class Husky extends Dog {
    public Husky(String name, int haarlaenge) {
        super(name, haarlaenge);
    }

    @Override
    public void makeNoise() {
        System.out.println("Husky bellt!");
    }
}
