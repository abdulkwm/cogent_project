package pkg.collection;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Random obj = new Random();
        Set<String> set = new TreeSet<>();
        set.add("abdu");
        set.add("cde");
        set.add("fgh");
        set.add("igk");
        set.add("aah");
//        set.add(140);
        System.out.println("Set is: "+ set);
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
