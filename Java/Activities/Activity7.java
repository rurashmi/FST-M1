package activities;
interface BicycleParts{
    public int gears = 0;
    public int currentSpeed = 0;
}
interface BicycleOperations{
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}
//Base Class
class Bicycle implements BicycleParts, BicycleOperations {
    public int gears;
    public int currentSpeed;
    //Constructor
    public Bicycle(int gears, int currentSpeed){
        this.gears= gears;
        this.currentSpeed = currentSpeed;
    }
    //Methods
    public void applyBrake(int decrement){
        currentSpeed -= decrement;
        System.out.println("Current Speed: " + currentSpeed);
    }
    public void speedUp(int increment) {
        currentSpeed += increment;
        System.out.println("Current Speed is: " + currentSpeed);
    }
    public String bicycleDesc(){
        return("No of gears are " + gears + "\nSpeed of bicycle is " + currentSpeed);
    }
}
//Derived class
class MountainBike extends Bicycle{
    public int seatHeight;
    //Constructor
    public MountainBike(int gears, int currentSpeed, int startHeight){
        super(gears, currentSpeed);
        seatHeight = startHeight;
    }
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
    public String bicycleDesc(){
        return(super.bicycleDesc() + "\nseat height is " + seatHeight);
    }

}

public class Activity7 {
    public static void main(String[] args){
        MountainBike mb = new MountainBike(3,0, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }
}
