package multithreading2;

public class DisplayMessage {
    public synchronized void  sayHello(String name) throws InterruptedException {
        for (int i = 0; i <= 10; i++){
            System.out.println("How are you " + name);
            Thread.sleep(200);
        }
    }
}
