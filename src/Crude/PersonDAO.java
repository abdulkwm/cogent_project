package Crude;

import java.util.Scanner;

public class PersonDAO {
    Scanner sc = new Scanner(System.in);
    public void create(Person person[], int i){
        Person p = new Person();
        person[i] = p;
        System.out.println("please enter the person id");
        person[i].setPersonId(sc.nextInt());
        System.out.println("please enter person name");
        person[i].setPersonName(sc.next());
        System.out.println("please enter person address");
        person[i].setPersonAddress(sc.next());
    }
    public void read(Person[] person){
        for (Person p:person){
            System.out.println("person id is: " + p.getPersonId());
            System.out.println("person name is: " + p.getPersonName());
            System.out.println("person address is: " +p.getPersonAddress());
        }

    }
    public void update(){

    }
    public void delete(){

    }
}
