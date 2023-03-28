package coding;

public class Bingo {
    public static void main(String[] args) {
        int [] bingoNum = {5, 12, 23 , 31 , 40};
        if (args.length == 2){
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            if (num1 < 1 || num1 > 40 || num2 < 1 || num2 > 40) {
                System.out.println("number is not in the range");
            }else {
                for (int i = 0; i < bingoNum.length; i++){
                    if (bingoNum[i] == num1 && bingoNum[i] == num2 ) {
                        System.out.println("BINGO");
                    }
                    else {
                        System.out.println("try again");
                    }
                }
            }
        }
    }
}
