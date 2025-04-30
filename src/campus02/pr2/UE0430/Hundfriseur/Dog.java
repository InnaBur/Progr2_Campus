package campus02.pr2.UE0430.Hundfriseur;

public abstract class Dog extends Animal {

    private int haarlaenge;

    public Dog(String name, int haarlaenge) {
        super(name);
        this.haarlaenge = haarlaenge;
    }

    public abstract void makeNoise();

    public int getHaarlaenge() {
        return haarlaenge;
    }

    public void setHaarlaenge(int haarlaenge) {
        this.haarlaenge = haarlaenge;
    }
}
