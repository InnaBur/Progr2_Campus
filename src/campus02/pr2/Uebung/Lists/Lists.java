package campus02.pr2.Uebung.Lists;

import campus02.pr2.Uebung.Buecher.Fossilien;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        List<Fossilien> fossils = new ArrayList<>();
        Fossilien fossilien = new Fossilien("etwas", 10);
        Fossilien fossilien1 = new Fossilien("etwas1", 100);
        Fossilien fossilien2 = new Fossilien("etwas2", 123456);
        Fossilien fossilien3 = new Fossilien("etwas3", 436262);

        fossils.add(fossilien);
        fossils.add(fossilien1);
        fossils.add(fossilien2);
        fossils.add(fossilien3);

        for(Fossilien f: fossils) {
            System.out.println(f);
        }

        System.out.println("Foss in position 2 is " + fossils.get(2));
    }
}
