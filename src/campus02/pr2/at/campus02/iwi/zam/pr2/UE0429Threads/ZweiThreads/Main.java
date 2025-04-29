package campus02.pr2.at.campus02.iwi.zam.pr2.UE0429Threads.ZweiThreads;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hallo! I'm " + Thread.currentThread().getName());
        MyThread2 myThread2 = new MyThread2();
        System.out.println("Threads start...");
        Thread t1 = new Thread(myThread2);
        t1.start();

        System.out.println(t1.getState());
        Thread.sleep(3000);
        myThread2.requestShutdown();
        System.out.println(t1.getState());
        System.out.println("Join");
        t1.join();


        System.out.println(t1.getState());
        System.out.println("Main finished");
    }

}
