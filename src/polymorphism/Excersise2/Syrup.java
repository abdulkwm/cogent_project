package polymorphism.Excersise2;

public class Syrup extends Medicine{
    public Syrup(String name, String address) {
        super(name, address);
    }

    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("shake before use");
    }
}
