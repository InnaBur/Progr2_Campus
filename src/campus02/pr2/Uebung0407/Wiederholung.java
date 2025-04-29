package campus02.pr2.Uebung0407;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Wiederholung {

    public static void main(String[] args) {
//        Integer age1 = null;
//
//        age1+=1;
//        System.out.println("Age " + age1);

        System.out.println(LocalDate.now().plusDays(30));
        LocalDate.of(1, 1, 1);
        LocalDate date = LocalDate.EPOCH;
        date.isBefore(LocalDate.now());

    }
}
