package java8new_Features.built_in_functionalInterface;

public class Student {
    int rollNo;
    int className;
    String name;

    public Student(int rollNo, int className, String name) {
        this.rollNo = rollNo;
        this.className = className;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getClassName() {
        return className;
    }

    public void setClassName(int className) {
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
