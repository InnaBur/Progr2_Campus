package campus02.pr2.Uebung.Buecher;

public class Fossilien {

    private String name;
    private int age;

    public Fossilien(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Fossilien{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
