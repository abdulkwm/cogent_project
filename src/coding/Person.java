package coding;

public class Person {
    public static void main(String[] args) {
        Person p1 = new Person(34,"abdu","hello",23,"ohio");

//        p1.setPersonId(1001);
//        p1.setPersonFirstName("abdu");
//        p1.setPersonLastName("ahmed");
//        p1.setPersonAge(23);
        p1.setPersonAddress("Columbus");
        System.out.println("person id: " + p1.getPersonId());
        System.out.println("coding.Person firstName: " + p1.getPersonFirstName());
        System.out.println("person lastName: " + p1.getPersonLastName());
    }
    int personId;
    String personFirstName;
    String personLastName;
    int personAge;
    String personAddress;

    public Person() {
    }

    public Person(int personId, String personFirstName, String personLastName, int personAge, String personAddress) {
        this.personId = personId;
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
        this.personAge = personAge;
        this.personAddress = personAddress;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonFirstName() {
        return personFirstName;
    }

    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }
}
