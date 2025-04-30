package campus02.pr2.UE0430.Hundfriseur;

import java.util.Scanner;

public class Hundefriseur {

    private String name;

    public Hundefriseur(String name) {
        this.name = name;
    }

    public void haareSchneiden(Dog d, int haarLaengeZuSchneiden) {
        int ungeschnitteneHaare =  d.getHaarlaenge();
        if (ungeschnitteneHaare >= haarLaengeZuSchneiden) {
            System.out.println("Hurray! Haare ist schon geschnitten");
            d.setHaarlaenge(ungeschnitteneHaare - haarLaengeZuSchneiden);
            System.out.println(d.getClass().getSimpleName() + " hat jetzt Haare mit der Laenge " + d.getHaarlaenge());
        } else {
            System.out.println(d.getClass().getSimpleName() + " hat nicht genug Haare! Leider, die Haare ist nicht geschnitten!");
        }
    }

    public void haareSchneidenMitScanner (Dog d) {
        Scanner scanner = new Scanner(System.in);
        int ungeschnitteneHaare = d.getHaarlaenge();
        int haarLaengeZuSchneiden;

        do {
            System.out.println("Geben Sie bitte, wie viel Haare abschneiden soll");
             haarLaengeZuSchneiden = scanner.nextInt();

            if (ungeschnitteneHaare >= haarLaengeZuSchneiden) {
                System.out.println("Hurray! Haare ist schon geschnitten");
                d.setHaarlaenge(ungeschnitteneHaare - haarLaengeZuSchneiden);
                System.out.println(d.getClass().getSimpleName() + " hat jetzt Haare mit der Laenge " + d.getHaarlaenge());
                break;
            } else {
                System.out.println(d.getClass().getSimpleName() + " hat nicht genug Haare! Probieren Sie noch Mal!");
            }
        } while (ungeschnitteneHaare < haarLaengeZuSchneiden);
    }

}
