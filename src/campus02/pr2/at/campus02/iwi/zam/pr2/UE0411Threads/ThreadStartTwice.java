package campus02.pr2.at.campus02.iwi.zam.pr2.UE0411Threads;

public class ThreadStartTwice extends  Thread{

    @Override
    public void run() {
        System.out.println("I am a thread and i'm running");
        System.out.println("I'm in Thread mit dem namen " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadStartTwice t1 = new ThreadStartTwice();
        t1.start();
        ThreadStartTwice t2 = new ThreadStartTwice();
        t2.start();

//        for (int i = 0; i < 10; i++) {
//            ThreadStartTwice t_tmp = new ThreadStartTwice();
//            t_tmp.start();
//        }
        System.out.println("Ich bin im Thread " + Thread.currentThread().getName() );
    }
}
