package exception_handling;

public class LowBalanceException extends Exception {
    public LowBalanceException(String message){
        super(message);
    }
}
