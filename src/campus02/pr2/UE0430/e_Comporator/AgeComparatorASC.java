package campus02.pr2.UE0430.e_Comporator;

import java.util.Comparator;

public class AgeComparatorASC implements Comparator<Hase> {
    @Override
    public int compare(Hase o1, Hase o2) {
        if(o1.getAlt() < o2.getAlt()) return -1;
        if (o1.getAlt() > o2.getAlt()) return 1;
        return 0;
    }
}
