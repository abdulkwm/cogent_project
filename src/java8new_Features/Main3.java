package java8new_Features;
interface MyInterface4 {
    int product(int s);
}
//class MyClass implements MyInterface4 {
//
//    @Override
//    public int sum(int a, int b) {
//        return a + b;
//    }
//}
public class Main3 {
    public static void main(String[] args) {
//        MyClass mc = new MyClass();
//        int x = mc.sum(12,34);
//        System.out.println("Sum is : " + x);
       MyInterface4 mi = (s) -> s*s;
       System.out.println(mi.product(10));
        }
    }
