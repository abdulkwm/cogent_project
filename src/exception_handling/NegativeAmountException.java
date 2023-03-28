package exception_handling;

public class NegativeAmountException extends Exception {
    public NegativeAmountException(String message){
        super(message);
    }
}
