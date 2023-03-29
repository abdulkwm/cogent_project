package collection.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.setNames();
        student.searchName("alex");
        student.searchName("john");

        student.searchName(2);
        student.searchName(6);

        student.printNames();
        student.removeNames("alex");
        student.removeNames("abdu");

        student.printNames();
    }
}
