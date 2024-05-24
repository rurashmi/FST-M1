package activities;

public class Car {
    // Class variables
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    //Constructors
    Car(){
        tyres = 4;
        doors = 4;
    }
    //Class methods
    public void displayCharacteristics(){
        System.out.println("Color of the car is: " +color);
        System.out.println("Make of the car is: " +make);
        System.out.println("Transmission of the car is " +transmission);
        System.out.println("Number of doors in the car is " + doors);
        System.out.println("Number of tyres in the car is " + tyres);

    }
    public void accelerate(){
        System.out.println("Car is moving forward");
            }
    public void brake(){
        System.out.println("Car has stopped");

    }
}
