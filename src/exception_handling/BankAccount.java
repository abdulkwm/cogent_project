package exception_handling;

public class BankAccount {
    int accNo;
    String custName;
    String accType;
    float balance;

    public BankAccount(int accNo, String custName, String accType, float balance) throws NegativeAmountException, LowBalanceException {
        if (balance < 0) {
            throw new NegativeAmountException("Initial balance can not be negative");
        }
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        if (accType.equals("Savings")) {
            if (balance < 1000) {
                throw new LowBalanceException("Saving balance is below minimum required balance.");
            }
            } else if (accType.equals("Current")) {
                if (balance < 5000) {
                    throw new LowBalanceException("Current balance is below minimum required balance.");
                }
            }
            this.balance = balance;
    }
    public void deposit(float amt) throws NegativeAmountException{
        if (amt < 0){
            throw new NegativeAmountException("Deposit Can not be negative");
        }
        this.balance += amt;
    }
    public void withdraw(float amt) throws NegativeAmountException, LowBalanceException, InsufficientFundsException {
        if (amt < 0){
            throw new NegativeAmountException("withdrawal amount can not be negative");
        }
        if (accType.equals("Savings")) {
            if (this.balance - amt < 1000){
                throw new LowBalanceException("Saving balance is below minimum required balance.");
            }
        } else if (accType.equals("Current")) {
            if (this.balance - amt < 5000){
                throw new LowBalanceException("Current balance is below minimum required balance.");
            }
        }
        if (this.balance - amt < 0) {
            throw new InsufficientFundsException("Insufficient funds");
        }
        this.balance -= amt;
    }
    public float getBalance() throws LowBalanceException {
        if (this.accType.equals("Saving") && this.balance < 1000){
            throw new LowBalanceException("Saving balance is below minimum required balance.");
        } else if (this.accType.equals("Current") && this.balance < 5000) {
            throw new LowBalanceException("Current balance is below minimum required balance.");
        }
        return this.balance;
    }
    public void display() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Customer Name: " + custName);
        System.out.println("Account Type: " + accType);
        System.out.println("Balance: " + balance);
    }
}
