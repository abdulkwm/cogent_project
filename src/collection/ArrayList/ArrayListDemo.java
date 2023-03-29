package collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
//        important methods of arrayList
        List<Integer> list = new ArrayList<>();
        for (int i = 10; i <= 100; i+=10){
            list.add(i);
        }
        System.out.println("list: " + list);
        list.add(2,100);
        System.out.println("list after insertion: " + list);
        list.set(3,300);
        System.out.println("list after replacement: " + list);
        List<Integer> secondList = new ArrayList<>();
        secondList.add(111);
        secondList.add(222);
        secondList.add(333);
        System.out.println("secondList: " + secondList);
        list.addAll(4,secondList);
        System.out.println(list);

        if (list.contains(222)){
            System.out.println("List has the value");
        }else {
            System.out.println("List doesn't have the value");
        }
        list.remove(3);
        System.out.println("list after deletion: " + list);
    }
}
