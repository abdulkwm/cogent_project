package polymorphism.Excersise2;

public class Medicine {
    String name;
    String address;

    public Medicine(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void displayLabel(){
        System.out.println("name of company : " + this.name);
        System.out.println("address of the company : " + this.address);
    }
}
