package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationDemo {
    public static void main(String[] args) {
        FileInputStream fis;
        try{
        fis = new FileInputStream("/Users/abdulkerim/Learning/cogent_university/streams/");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            Employee emp = (Employee) obj;
            System.out.println("Employee Id:" + emp.id);
            System.out.println("Employee name:" + emp.name);
            System.out.println("Employee salary:" + emp.salary);
            System.out.println("Employee SSN:" + emp.ssn);
            fis.close();
            ois.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
