package StaticDemo;
class Student {
    private static int age;

    public static void setAge(int newAge) {
        age = newAge;
    }

    public static int getAge() {
        return age;
    }
}
public class StaticDemo {
    public static void main(String[] args) {
        Student.setAge(20);
        System.out.println(Student.getAge());
    }
}
