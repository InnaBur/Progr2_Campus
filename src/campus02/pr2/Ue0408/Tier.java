package campus02.pr2.Ue0408;

public class Tier {

    private String name;
    private int alt;

    public Tier(String name, int alt) {
        this.name = name;
        this.alt = alt;
        System.out.println("Tier ist erstellt");
    }

    public Tier() {
        System.out.println("Tier ist erstellt");
    }

    final private void laermMachen() {
        System.out.println("Tier macht Larm");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlt() {
        return alt;
    }

    public void setAlt(int alt) {
        this.alt = alt;
    }
}
