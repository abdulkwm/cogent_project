package polymorphism.Excersise;

public class Car {
    int speed;
    int noOfGear;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNoOfGear() {
        return noOfGear;
    }

    public void setNoOfGear(int noOfGear) {
        this.noOfGear = noOfGear;
    }
    public void drive(int startingSpeed, int noOfGear){
    this.speed = startingSpeed;
    this.noOfGear = noOfGear;
    }
    public void display(){
        System.out.println("speed: " + this.speed);
        System.out.println("No of gears is : " + this.noOfGear);
    }
}
