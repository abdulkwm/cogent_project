package exception;
class Demo{
    public void division(int x, int y) throws ArithmeticException {
        int z = x/y;
        System.out.println(z);
    }
}
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            new Demo().division(50,0);
        }catch (ArithmeticException e){
            System.out.println("exception handled");
        }
        System.out.println("after catch block");
//        try {
//        String input = args[0];
//        System.out.println("input is:" + input);
//        int output = Integer.parseInt(input);
//        System.out.println("output is:" + output);
//
//        }catch (Exception e){
//            e.printStackTrace();
//
//        }finally {
//            System.out.println("works in both cases");
//        }
//        System.out.println("this is after try-catch");

//        ArithmeticException
//          Scanner sc = new Scanner(System.in);
//        System.out.println("enter two numbers:");
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        try {
//        int z = x/y;
//            System.out.println(z);
//        }catch (ArithmeticException e){
//            System.out.println("Division by zero is not allowed");
//        }
//        System.out.println("after catch block");
//
////        ArrayIndexOutOfBoundsException
//        String names [] = {"abdu","shiva","john","sophia"};
//        try {
//        System.out.println(names[6]);
//
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("trying to access element beyond the array range!");
//        }
//        System.out.println("after exception");

    }
}
