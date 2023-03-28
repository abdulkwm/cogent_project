package serialization;

import java.io.Serializable;
class FieldBlankException extends Exception {
    public FieldBlankException(String message) {
        super(message);
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
public class Student implements Serializable {
    int rollNo;
    String name;
    int age;
    String address;

    public Student(int rollNo, String name, int age, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
