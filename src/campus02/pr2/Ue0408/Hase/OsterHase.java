package campus02.pr2.Ue0408.Hase;

public class OsterHase extends Hase{
    public OsterHase(String name) {
        super(name);
    }

    public void versteckeOstereier () {
        System.out.println("Ich bin " + name + "! Ich habe alle Eier versteckt!");
    }

    @Override
    public void hoppeln() {
        System.out.println("Ich bin " + name + ", ich hoppele schnell!");
    }
}
