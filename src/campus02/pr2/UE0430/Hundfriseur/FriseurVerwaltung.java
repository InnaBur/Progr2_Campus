package campus02.pr2.UE0430.Hundfriseur;

public class FriseurVerwaltung {

    public static void main(String[] args) {

    Hundefriseur hundfriseur = new Hundefriseur("Bob");
    Husky husky = new Husky("Husky", 15);
    Beagle beagle =new Beagle("Bello", 7);

        System.out.println("Husky ist bereit!");
    hundfriseur.haareSchneiden(husky, 10);
    husky.makeNoise();

//        System.out.println("Beagle ist bereit!");
//    hundfriseur.haareSchneiden(beagle, 7);
//    beagle.makeNoise();

        System.out.println("Beagle ist nochmal bereit!");
    hundfriseur.haareSchneiden(beagle, 3);


    hundfriseur.haareSchneidenMitScanner(beagle);
    }
}
