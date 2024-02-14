package JavaQuestions.thread;

public class MyRunnable implements Runnable{


    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Thread2 running " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }

        }
    }
}
