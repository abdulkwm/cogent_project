package pkg.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("John",30);
        map.put("Tom",20);
        map.put("Lee",18);
        map.put("Brad",21);
        Set<String> keySet = map.keySet();
        System.out.println("KeySet: " + keySet);
        Collection<Integer> values = map.values();
        System.out.println("Values : " + values);
        for (String key : keySet){
            System.out.println("Key:" + key + " --> value:" + map.get(key));
        }
    }
}
