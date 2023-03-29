package multithreading2;

public class MyThread extends Thread{
    DisplayMessage dm;
    String name;
    public MyThread(DisplayMessage dm, String name){
        this.dm = dm;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            dm.sayHello(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
