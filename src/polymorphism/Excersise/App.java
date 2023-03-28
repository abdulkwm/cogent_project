package polymorphism.Excersise;

public class App {
    public static void main(String[] args) {
        Car ca = new Car();
        ca.drive(0,4);
        ca.display();
        SportCar spCa = new SportCar();
        spCa.drive(20,4);
        spCa.setAirBallonType("Normal");
        spCa.display();
    }
}
