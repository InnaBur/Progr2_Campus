package campus02.pr2.at.campus02.iwi.zam.pr2.ue2;

import javax.sound.sampled.DataLine;
import java.time.DayOfWeek;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        OpeningHours openingHours = new OpeningHours("7.00",
                "23.00", OpeningVariations.MONTOFRI);

        Shop myShop = new Shop("Best Shop in Town", openingHours);

        OpeningHours openingHourMyShop = myShop.getOpeningHours();
        String isOpen = openingHourMyShop.getOpeningHoursToday2(DayOfWeek.MONDAY);

        System.out.println(isOpen);

    }
}
