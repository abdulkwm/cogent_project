package exception_handling;

import java.util.Scanner;

public class CalcAverage {
    public double avgFirstN(int N) throws IllegalArgumentException {
        if (N <= 0) {
            throw new IllegalArgumentException("N must be positive integers");
        }
        double average = 0;
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum = sum + i;
        }
        average = (double) sum / N;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number N:");
        int x = sc.nextInt();
        CalcAverage calAvg = new CalcAverage();
        try {
            System.out.println("Average number from 1 to N: " + calAvg.avgFirstN(x));
        }catch (IllegalArgumentException message){
            System.out.println(message.getMessage());
        }
        System.out.println("Enter number a: ");
        int firstNum = sc.nextInt();
        System.out.println("Enter number b: ");
        int secondNum = sc.nextInt();
        Number n = new Number(firstNum, secondNum);
        int choice;
        do {
            System.out.println("******Menu*******");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    n.add();
                    n.display();
                    break;
                case 2:
                    n.sub();
                    n.display();
                    break;
                case 3:
                    n.mul();
                    n.display();
                    break;
                case 4:
                    try {
                        n.div();
                        n.display();
                    }catch (ArithmeticException e){
                        System.out.println("can not divide by 0");
                    }
                        break;
                case 5:
                    System.exit(0);
            }
        }while (choice != 5);
        System.out.println("exit");
        sc.close();
    }
}
