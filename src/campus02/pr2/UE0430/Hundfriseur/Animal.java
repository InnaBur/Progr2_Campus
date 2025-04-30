package campus02.pr2.UE0430.Hundfriseur;

public abstract class Animal {

    public String name;

    public abstract void makeNoise();

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
