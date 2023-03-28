package polymorphism.Excersise;

public class SportCar extends Car{
    String airBallonType;

    public String getAirBallonType() {
        return airBallonType;
    }

    public void setAirBallonType(String airBallonType) {
        this.airBallonType = airBallonType;
    }

    @Override
    public void drive(int startingSpeed, int noOfGear) {
        super.drive(startingSpeed, noOfGear);
        System.out.println("Initial speed : " + this.speed);
        System.out.println("Initial No of Gear : " + this.noOfGear);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("air Ballon type: " + this.airBallonType);
    }
}
