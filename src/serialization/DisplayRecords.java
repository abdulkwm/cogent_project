package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DisplayRecords {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("/Users/abdulkerim/Learning/cogent_university/streams/student");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true){
                try {
                    Student student = (Student) ois.readObject();
                    System.out.println(student);
                }catch (IOException e){
                    break;
                }catch (ClassNotFoundException e){
                    System.out.println("Error reading data from file: " + e.getMessage());
                }
            }
            ois.close();
            fis.close();
        } catch (IOException e) {
            System.out.println("Error reading data from file: " + e.getMessage());
        }
    }
}
