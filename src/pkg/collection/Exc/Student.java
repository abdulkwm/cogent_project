package pkg.collection.Exc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Student {
    private Map<String,String> empNames = new HashMap<>();
    public void setNames(String key, String value){
        this.empNames.put(key,value);
    }
    public void printName(){
        for (String name : empNames.values()){
            System.out.println(name);
        }
    }
    public void getName(String key){
        System.out.println(empNames.get(key));
    }
    public void printNamesKeySet(){
        Set<String> keySet = empNames.keySet();
        for (String key : keySet){
            System.out.println(empNames.get(key));
        }
    }
    public void printSize(){
        System.out.println(empNames.size());
    }
    public void remove(String key){
        System.out.println(empNames.remove(key));
    }
}
