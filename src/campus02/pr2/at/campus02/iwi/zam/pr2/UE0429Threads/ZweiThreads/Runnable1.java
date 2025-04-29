package campus02.pr2.at.campus02.iwi.zam.pr2.UE0429Threads.ZweiThreads;

public class Runnable1 implements Runnable {
    @Override
    public void run() {
        System.out.println("I'm a thread " + Thread.currentThread().getName());
        System.out.println("I'm finished");
    }
}
