package java8new_Features;
interface MyInterface {
    void m1();
    void m2();
    void m3();
    default void m4() {
        System.out.println("This is m4");
    }
}
class A implements MyInterface {
    @Override
    public void m1() {
        System.out.println("class- A I am inside m1");
    }

    @Override
    public void m2() {
        System.out.println("class- A I am inside m2");
    }

    @Override
    public void m3() {
        System.out.println("class- A I am inside m3");
    }
}
class B implements MyInterface {
    @Override
    public void m1() {
        System.out.println("class- B I am inside m1");
    }

    @Override
    public void m2() {
        System.out.println("class- B I am inside m2");
    }

    @Override
    public void m3() {
        System.out.println("class- B I am inside m3");
    }
}
public class Main {
    public static void main(String[] args) {
        MyInterface mi = new A();
       mi.m4();
       mi = new B();
       mi.m4();
    }
}
