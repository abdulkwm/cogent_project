package multithreading2;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++){
            System.out.println("i : " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
