package activities;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        //Plane with max 10 passengers
        Plane plane = new Plane(10);
        plane.onboard("John");
        plane.onboard("Steve");
        plane.onboard("Anna");
        plane.onboard("Neel");
        //Plane take off
        System.out.println("Plane took off at: " + plane.takeOff());
        //List of onboarded people
        System.out.println("People on the plane: " + plane.getPassengers());
        //Flying
        Thread.sleep(10000);
        //Plane has landed
        plane.land();
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassengers());

    }
}
