package multithreading3;

public class Storage {
    int value;
    boolean isUpdated;

    public synchronized void setValue(int value) {
        this.value = value;
        this.isUpdated = true;
        notify();
    }

    public synchronized int getValue() throws InterruptedException {
        while (!isUpdated){
            wait();
        }
        isUpdated = false;
        return this.value;
    }
}
