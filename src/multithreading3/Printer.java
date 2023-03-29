package multithreading3;

public class Printer extends Thread{
    Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }
    @Override
    public void run() {
        while (true){
            try {
                System.out.println("get: " + storage.getValue());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
