package campus02.pr2.at.campus02.iwi.zam.pr2.UE0429Threads.CurrentDate;

import java.time.LocalTime;
import java.util.Date;

public class DateThread implements Runnable {

    private boolean isRunning = true;

    public Object mySyncObj = new Object();

    public void requestShutdown() {
        isRunning = false;
    }
    @Override
    public void run() {

        while (isRunning) {
//        while (Thread.currentThread().isInterrupted() == false) {
            Date d = new Date();
            synchronized (mySyncObj) {
                System.out.println(Thread.currentThread().getName()  + " Now it is " + d);
            }
            try {



                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("My Schlaf ist interrupted");
            }
        }
        System.out.println("Thread shutting down");
    }
}
