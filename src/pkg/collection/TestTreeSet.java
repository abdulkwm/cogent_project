package pkg.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("abdu");
        set.add("abdulkerim");
        set.add("alex");
        set.add("john");
        boolean addedDuplicate = set.add("abdu");
        System.out.println("added duplicate? " + !addedDuplicate);

        System.out.println("all product names:");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("First product: " + set.first());
        System.out.println("Last product: " + set.last());

        System.out.println("size of treeSet : " + set.size());

        boolean removed = set.remove("alex");
        System.out.println("removed? " + removed);

        System.out.println("size of treeSet after removal : " + set.size());
    }

}
