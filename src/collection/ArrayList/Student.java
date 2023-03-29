package collection.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private List<String> names = new ArrayList<>();
    public void setNames(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: done when you finish: ");
        while (true) {
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            names.add(name);
        }
    }
    public void searchName(String name){
        if (names.contains(name)){
            System.out.println("found in the list");
        }else {
            System.out.println("not found in the list");
        }
    }
    public void searchName(int index){
        if (index < 0 || index >= names.size()){
            System.out.println("invalid index");
        }else {
            System.out.println("name at index " + index + ": " + names.get(index));
        }
    }
    public void printNames(){
        System.out.println();
    }
    public void removeNames(String stuName){
        if (names.remove(stuName)){
            System.out.println(stuName + " removes from the list");
        }else {
            System.out.println(stuName + " not found in the list");
        }
    }
}
