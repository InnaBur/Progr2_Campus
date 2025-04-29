package campus02.pr2.at.campus02.iwi.zam.pr2.ue1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie bitte Ihre Alter: ");
        int alter = scanner.nextInt();

        AgeCalculator ageCalculator = new AgeCalculator();
        System.out.println("Sie sind " + alter + " Jahren, " + ageCalculator.monateRechnen(alter) + " Monaten, "
                + ageCalculator.wochenRechnen(alter) + " Wochen, " + ageCalculator.tagenRechnen(alter) + " Tagen");
    }
}