package campus02.pr2.at.campus02.iwi.zam.pr2.ue2;

import java.time.DayOfWeek;

public class OpeningHours {

    private final String OPENING_TIME;
    private final String CLOSING_TIME;
    boolean debug = true;
    OpeningVariations OPENING_VARIATIONS;

    public OpeningHours(String openingTime, String closingTime, OpeningVariations openingVariations) {
        this.OPENING_TIME = openingTime;
        this.CLOSING_TIME = closingTime;
        this.OPENING_VARIATIONS = openingVariations;
        System.out.println("Obj created");
    }

    public String getOpeningHoursToday(DayOfWeek dayOfWeek) {
        if (debug) {
            System.out.println("openingTime " + OPENING_TIME + " closingTime " + CLOSING_TIME + " openingVariations " +
                    OPENING_VARIATIONS + " dayOfWeek " + dayOfWeek);
        }
        String isOffen = "";
        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            isOffen = "Heute ist " + dayOfWeek + ". Das Gesaeft ist geschlossen";
        } else if (dayOfWeek == DayOfWeek.MONDAY && OPENING_VARIATIONS == OpeningVariations.THUTOFRI) {
            isOffen = "Heute ist " + dayOfWeek + ". Das Gesaeft ist geschlossen";
        } else {
            isOffen = "Heute ist " + dayOfWeek + ". Das Gesaeft ist geoeffnet";
        }
        return isOffen;
    }



    public String getOpeningHoursToday2(DayOfWeek dayOfWeek) {
        if (debug) {
            System.out.println("openingTime " + OPENING_TIME + " closingTime " + CLOSING_TIME + " openingVariations " +
                    OPENING_VARIATIONS + " dayOfWeek " + dayOfWeek);
        }

        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            return "Heute ist " + dayOfWeek + ". Das Gesaeft ist geschlossen";
        }
        if (dayOfWeek == DayOfWeek.MONDAY && OPENING_VARIATIONS == OpeningVariations.THUTOFRI) {
            return "Heute ist " + dayOfWeek + ". Das Gesaeft ist geschlossen";
        }
        return "Heute ist " + dayOfWeek + ". Das Gesaeft ist geoeffnet von " + OPENING_TIME + " bis " + CLOSING_TIME;
    }
}
//System.getProperty("line.separator");