package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    private List<String> passengers;
    private int maxPassenger;
    private Date lastTimeTookOff;
    private Date lastTimeLanded;
    public Plane(int maxPassenger){
        this.maxPassenger = maxPassenger;
        this.passengers = new ArrayList<>();
    }
    public void onboard(String passenger){
        this.passengers.add(passenger);
    }
    public Date takeOff(){
        this.lastTimeTookOff = new Date();
        return lastTimeTookOff;
    }
    public void land(){
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }
    public Date getLastTimeLanded(){
        return lastTimeLanded;
    }
    public List<String> getPassengers(){
        return passengers;
    }

}
