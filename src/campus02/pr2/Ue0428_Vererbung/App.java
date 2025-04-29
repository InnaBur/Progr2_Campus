package campus02.pr2.Ue0428_Vererbung;

public class App {

    public static void main(String[] args) {


        Orchester orchester = new Orchester();
        orchester.addInstrument(new Geige(5));
        orchester.addInstrument(new Gitarre(7));
        orchester.addInstrument(new Pauke(10));
        orchester.addInstrument(new Trompete(13));

        int orchLaut = orchester.playAll();

        System.out.println("Orchester spielt mit laute " + orchLaut);
    }
}
