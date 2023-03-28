package streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStream {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("/Users/abdulkerim/Learning/cogent_university/streams/employee.txt");
             FileOutputStream fos = new FileOutputStream("/Users/abdulkerim/Learning/cogent_university/streams/newemployee.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
