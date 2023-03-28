package polymorphism.Excersise2;

public class Tablet extends Medicine{
    public Tablet(String name, String address) {
        super(name, address);
    }

    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("store in cool dry place");
    }
}
