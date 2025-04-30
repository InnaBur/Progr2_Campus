package campus02.pr2.UE0430.d_HasenSortieren;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Hase> hasen = new ArrayList<>();

        hasen.add(new Hase("Bob", 13, 2));
        hasen.add(new Hase("Bil", 13, 6));
        hasen.add(new Hase("Bonny", 10, 12));
        hasen.add(new OsterHase("Schenk", 7, 5));
        hasen.add(new OsterHase("Ost", 7, 10));

        printHasenList(hasen);
        Collections.sort(hasen);
        printHasenList(hasen);

    }

    private static void printHasenList(ArrayList<Hase> hasen) {
        System.out.println("Hasen List: ");
        for (Hase hase: hasen) {
            System.out.println(hase);
        }
        System.out.println("-----------------------");
    }
}
