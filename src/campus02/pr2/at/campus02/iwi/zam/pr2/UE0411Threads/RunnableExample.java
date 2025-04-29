package campus02.pr2.at.campus02.iwi.zam.pr2.UE0411Threads;

import campus02.pr2.at.campus02.iwi.zam.pr2.UE0429Threads.ZweiThreads.MyThread2;

public class RunnableExample implements Runnable {

    public static void main(String[] args) {
        System.out.println("Creating..");
        Runnable runnable =new RunnableExample();
        System.out.println("Creating thread");
        MyThread2 myThread2 = new MyThread2();
        Thread thread = new Thread(runnable);
        thread.setName("my Thread");
        thread.start();
    }
    @Override
    public void run() {
        System.out.println("I'm a thread " + Thread.currentThread().getName());
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Etwas..");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
