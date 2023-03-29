package multithreading3;

public class Counter extends Thread{
    Storage storage;
    int count;

    public Counter(Storage storage) {
        this.storage = storage;
        this.count = 0;
    }
    @Override
    public void run() {
        while (true){
            synchronized (storage){
                this.count++;
                System.out.println("store :" + count);
                storage.setValue(this.count);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
