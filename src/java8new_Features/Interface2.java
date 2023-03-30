package java8new_Features;
public interface Interface2 {
//    Functional Interface it only has one abstract method and
//            it can have more than one default method
//    SAM-Single Abstract Method
    public void m1();
    default void m2(){
        System.out.println("This is m2");
    }
    public static void m3(){
        System.out.println("this is m3");
    }
    public void m4();
}
