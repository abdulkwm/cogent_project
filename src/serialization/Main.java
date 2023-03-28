package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        String input;
        while (true){
            try {
                System.out.println("Enter roll number: ");
                input = sc.nextLine();
                if (input.isEmpty()){
                    throw new FieldBlankException("Roll number Can not be blank");
                }
                int rollNumber = Integer.parseInt(input);
                System.out.println("Enter name: ");
                input = sc.nextLine();
                if (input.isEmpty()){
                    throw  new FieldBlankException("Name can not be blank");
                }
                String name = input;
                System.out.println("Enter age: ");
                input = sc.nextLine();
                if (input.isEmpty()){
                    throw new FieldBlankException("Age cannot be blank");
                }
                int age = Integer.parseInt(input);
                System.out.println("Enter the Address: ");
                input = sc.nextLine();
                if (input.isEmpty()){
                    throw new FieldBlankException("Address can not be blank");
                }
                String address = input;
                students.add(new Student(rollNumber,name,age,address));

            }catch (NumberFormatException e){
                System.out.println("Invalid input: " + e.getMessage());
            }catch (FieldBlankException e){
                System.out.println("Filed blank error: " + e.getMessage());
            }
            System.out.println("Do you want to enter another record? (Y/N): ");
            input = sc.nextLine();
            if (!input.toUpperCase().equals("Y")) {
                break;
            }
        }
        System.out.println("Do you want to write the data to a file? (Y/N): ");
        input = sc.nextLine();
        if (input.toUpperCase().equals("Y")) {
            try{
                FileOutputStream fos = new FileOutputStream("/Users/abdulkerim/Learning/cogent_university/streams/students");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for (Student student : students) {
                    oos.writeObject(student);
                }
                oos.close();
                fos.close();
                System.out.println("Data written to file successfully");
            }catch (IOException e){
                System.out.println("Error : " + e.getMessage());
            }
        }else {
            System.out.println("terminated");
        }
    }
}
