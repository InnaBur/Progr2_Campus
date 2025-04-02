package campus02.pr2.Uebung01;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Dates {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate startOfStudy = LocalDate.of(2025, 3, 3);
        LocalDate parsedDate = LocalDate.parse("2020-03-16");

        System.out.println("Today is " + today);
        System.out.println("Study started " + startOfStudy);
        System.out.println("Parsed " + parsedDate);

        System.out.println("Day " + startOfStudy.getDayOfMonth());
        System.out.println("Month " + startOfStudy.getMonth());

        //manipulate
        System.out.println("Challenge would be over " + today.plusDays(75));
        System.out.println(today.atStartOfDay());
        System.out.println(today.getEra());
        System.out.println(today.getChronology());

        //compare
        System.out.println(today.isBefore(startOfStudy));
        System.out.println(today.isAfter(startOfStudy));
        System.out.println(today.isEqual(startOfStudy));

        //until
        LocalDate startOfTraining = LocalDate.of(2025, 9, 8);
        Period period = startOfStudy.until(startOfTraining);
        System.out.println(period);
        System.out.println("month " + period.get(ChronoUnit.MONTHS) + " days " + period.get(ChronoUnit.DAYS));
    }
}
