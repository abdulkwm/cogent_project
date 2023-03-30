package pkg.collection;

import java.util.Comparator;

public class Student {
    private int rolNo;
    private String name;

    public Student(int rolNo, String name) {
        this.rolNo = rolNo;
        this.name = name;
    }

    public int getRolNo() {
        return rolNo;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student [" +
                "rolNo=" + rolNo +
                ", name='" + name + '\'' +
                ']';
    }
//    @Override
//    public int compareTo(Student o) {
//        return this.name.compareTo(o.name);
//    }
public static Comparator<Student> NameComparator = new Comparator<Student>() {
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
};
}
