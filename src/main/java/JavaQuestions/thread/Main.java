package JavaQuestions.thread;

public class Main {

    public static void main(String[] args) {

       MyThread thread1 = new MyThread();
        thread1.start();
        Thread thread = new Thread(new MyRunnable());
        thread.start();



        }
    }