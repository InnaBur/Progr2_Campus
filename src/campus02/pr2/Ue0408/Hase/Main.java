package campus02.pr2.Ue0408.Hase;

public class Main {

    public static void main(String[] args) {

        OsterHase osterHase = new OsterHase("Osti");
        WeihnachtsHase weihnachtsHase = new WeihnachtsHase("Schnee");

        osterHase.schlafen();
        osterHase.hoppeln();
        weihnachtsHase.fressen();
        osterHase.versteckeOstereier();

        weihnachtsHase.schlafen();
        weihnachtsHase.hoppeln();
        weihnachtsHase.fressen();
        weihnachtsHase.verteileGeschenke();

    }
}
