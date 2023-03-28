package exception_handling;

import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        int accNo = sc.nextInt();
       sc.nextLine();
        System.out.println("Enter Customer Name: ");
        String custName = sc.nextLine();
        System.out.println("Enter Account Type (Saving/Current): ");
        String accType = sc.nextLine();
        System.out.println("Enter Initial Balance");
        float balance = sc.nextFloat();
//        sc.close();
        try {
            BankAccount account = new BankAccount(accNo,custName,accType,balance);
            int choice;
            do {
                System.out.println("*****Menu*****");
                System.out.println("1. Display the Account info");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.println("Enter your choice");
                choice = sc.nextInt();
                switch (choice){
                    case 1:
                        account.display();
                        break;
                    case 2:
                        System.out.println("enter deposit: ");
                        float depo = sc.nextFloat();
                        account.deposit(depo);
                        System.out.println("New Balance: " + account.getBalance());
                        break;
                    case 3:
                        System.out.println("enter withdraw: ");
                        float withd = sc.nextFloat();
                        account.withdraw(withd);
                        System.out.println("New Balance: " + account.getBalance());
                        break;
                    case 4:
                        System.exit(0);
                        break;
                }
            }while (choice != 4);
//            account.display();
//            System.out.println("enter the deposit");
//            float depo = sc.nextFloat();
//            account.deposit(depo);
//            System.out.println("New Balance: " + account.getBalance());
//            account.withdraw(1000);
//            System.out.println("New Balance: " + account.getBalance());
        }catch (NegativeAmountException e) {
            System.out.println("Error: Negative amount entered.");
        }catch (InsufficientFundsException e){
            System.out.println("Error: Insufficient funds.");
        }catch (LowBalanceException e) {
            System.out.println("Error: Balance below minimum required.");
        }
    }
}
