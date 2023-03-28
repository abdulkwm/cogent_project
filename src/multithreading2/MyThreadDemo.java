package multithreading2;

public class MyThreadDemo{
    public static void main(String[] args) {
        MyThread2 mt = new MyThread2();
        Thread th = new Thread(mt);
        th.start();
        System.out.println("part 2:");
        for (int j = 0; j <= 10; j++ ){
            System.out.println("j : " + j + "\t ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
