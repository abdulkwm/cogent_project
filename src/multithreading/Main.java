package multithreading;

//class MyThread implements Runnable {
//
//    @Override
//    public void run() {
//        for (int i = 0; i <= 10; i++ ){
//            System.out.println("i : " + i + "\t ");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
class MyThread extends Thread {
    MyThread(){
        super("Demo thread");
        System.out.println("the child thread :" + this);
        start();
}
    @Override
    public void run() {
        for (int i = 5; i > 0; i-- ){
            System.out.println("Child thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("exiting the child thread");
        }
    }
//    @Override
//    public void run() {
//        for (int i = 0; i <= 10; i++ ){
//            System.out.println("i : " + i + "\t ");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
}
public class Main {
    public static void main(String[] args){
        new MyThread();
        for (int i = 5; i > 0; i-- ){
            System.out.println("Child thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("main thread exiting");
        }
//        MyThread mt = new MyThread();
//        Thread th = new Thread(mt);
//        th.start();
//
//        for (int j = 0; j <= 10; j++ ){
//            System.out.println("j : " + j + "\t ");
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }

    }
}