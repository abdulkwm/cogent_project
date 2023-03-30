package pkg.collection.Exc;

public class TestHashMap {
    public static void main(String[] args) {
        Student student = new Student();
        student.setNames("abdu","alex");
        student.setNames("lee","sofia");
        System.out.println("print all names:");
        student.printName();
        System.out.println("print name of key 'lee' :");
        student.getName("lee");
        System.out.println("print all names by using keySet :");
        student.printNamesKeySet();
        System.out.println("print size of hash map:");
        student.printSize();
        System.out.println("remove a value by using key 'lee' :");
        student.printName();
    }
}
