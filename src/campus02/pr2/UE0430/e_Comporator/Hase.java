package campus02.pr2.UE0430.e_Comporator;

public class Hase implements Comparable<Hase> {

    private String name;
    private int alt;
    private int karotte;

    public Hase(String name, int alt, int karotte) {
        this.name = name;
        this.alt = alt;
        this.karotte = karotte;
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

    public int getKarotte() {
        return karotte;
    }

    public void setKarotte(int karotte) {
        this.karotte = karotte;
    }

    @Override
    public int compareTo(Hase o) {
        if (this.alt > o.alt)
            return 1;
        if (this.alt < o.alt)
            return -1;
        if (this.karotte > o.karotte)
            return 1;
        if (this.karotte < o.karotte)
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Hase{" +
                "name='" + name + '\'' +
                ", alt=" + alt +
                ", karotte=" + karotte +
                '}';
    }
}
