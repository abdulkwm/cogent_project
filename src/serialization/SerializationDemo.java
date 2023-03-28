package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializationDemo {

    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("/Users/abdulkerim/Learning/cogent_university/streams/employee");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee emp = new Employee(1,"john",1000,1234);
            while (true){
                System.out.println(emp);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
