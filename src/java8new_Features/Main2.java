package java8new_Features;
interface MyInterface1 {
  static void m1(){
      System.out.println("this is static method");
  }
}
public class Main2 {
    public static void main(String[] args) {
       MyInterface1.m1();
    }
}
