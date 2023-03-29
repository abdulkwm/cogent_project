package multithreading3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        synchronized (t){
            System.out.println("Main thread is going to wait:");
            t.wait();
            System.out.println("main thread notifying");
            System.out.println(t.total);
        }
    }
}
