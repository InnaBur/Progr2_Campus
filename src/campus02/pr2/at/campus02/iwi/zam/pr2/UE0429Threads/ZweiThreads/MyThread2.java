package campus02.pr2.at.campus02.iwi.zam.pr2.UE0429Threads.ZweiThreads;

public class MyThread2 implements Runnable {

    private boolean isRunning = true;
    public void requestShutdown() {
        isRunning = false;
    }

    @Override
    public void run() {
        System.out.println("I'm a thread " + Thread.currentThread().getName());

        int count = 0;
        while (isRunning) {
            try {
                Thread.sleep(1000);
                count++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " I'm running");

//            if (count == 5) {
//                requestShutdown();
//                System.out.println("I'm finished");
//            }
        }
        System.out.println(Thread.currentThread().getName() + " I'm finished");
    }
}
