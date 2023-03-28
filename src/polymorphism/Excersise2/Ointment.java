package polymorphism.Excersise2;

public class Ointment extends Medicine{
    public Ointment(String name, String address) {
        super(name, address);
    }
    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("for external use only!");
    }
}
