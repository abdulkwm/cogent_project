package pkg.collection;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSortDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(2,"lee"));
        students.add(new Student(3,"john"));
        students.add(new Student(1,"alex"));
        students.add(new Student(4,"sofia"));
        students.add(new Student(5,"zoe"));

        System.out.println("Unsorted data: ");
        for (Student student : students){
            System.out.println(student);
        }
//        Collections.sort(students);
        Collections.sort(students, Student.NameComparator);
        System.out.println("Sorted data: ");
        for (Student student : students){
            System.out.println(student);
        }
    }
}
