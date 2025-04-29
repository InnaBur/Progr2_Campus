package campus02.pr2.at.campus02.iwi.zam.pr2.UE0429Threads.CurrentDate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hallo from main");
        Object mySyncMainObj = new Object();
        DateThread dateThread = new DateThread();
        Thread date = new Thread(dateThread);
        Thread date2 = new Thread(dateThread);
        date.start();
        date2.start();
        dateThread.mySyncObj = mySyncMainObj;
        System.out.println("For STOP taste ENTER");
        Scanner scanner = new Scanner(System.in);
        String enterKey = scanner.nextLine();

        if (enterKey.isEmpty()) {
            dateThread.requestShutdown(); //eigene Funktion

//            date.interrupt();
            System.out.println("Good Bye!");
        }
        System.out.println("Bye from main");
    }
}
