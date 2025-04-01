package campus02.pr2.Uebung.Wrapper;

import java.util.Scanner;

public class StudentValidation {

    public static void main(String[] args) {

        final int MIN_AGE = 18;
        final int MAX_AGE = 99;
        final double MIN_GRADE = 1;
        final double MAX_GRADE = 2.5;

        System.out.println("How old are you?");
        Scanner scanner = new Scanner(System.in);
        Integer age = Integer.parseInt(scanner.next());

        if (age < MIN_AGE || age > MAX_AGE) {
            System.out.println("Sorry, you cannot participate in the program");
        } else {
            System.out.println("What's your grade average?");
            Double grade = scanner.nextDouble();
            if (grade < MIN_GRADE || grade > MAX_GRADE) {
                System.out.println("Sorry, you cannot participate in the program");
            } else {
                System.out.println("What's your field of study?");
                String field = scanner.next();
                if (FieldOfStudie.INFORMATICS.toString().equals(field.toUpperCase())) {
                    System.out.println("Congrats, you're in");
                } else System.out.println("Sorry, try again");
            }
        }
    }
}
