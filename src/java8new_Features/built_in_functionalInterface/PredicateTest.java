package java8new_Features.built_in_functionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Student st1 = new Student(1,4,"Tom");
        Student st2 = new Student(2,5,"john");
        ArrayList<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        Predicate<Integer> p = (s) -> s == 2;
        for (Student st : list){
            if (p.test(st.getRollNo())){
                System.out.println(st.getName() + " " + st.className);
            }
        }
    }
}
