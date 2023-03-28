package streams;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadEmployeeData {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("/Users/abdulkerim/Learning/cogent_university/streams/employee.txt")) {
            System.out.println("File is open");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}