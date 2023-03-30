package java8new_Features;
interface myInterface5{
    void print(String a);
}
public class LambdaDemo {
    public static void main(String[] args) {
        myInterface5 mi = (a -> System.out.println("the length of the string is : " + a.length()));
        mi.print("Hello");
    }
}
