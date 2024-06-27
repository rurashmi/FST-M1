package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args){
        HashMap<Integer, String> colors = new HashMap<Integer, String>();
        colors.put(1, "Red");
        colors.put(2, "Green");
        colors.put(3, "Blue");
        colors.put(4, "Yellow");
        colors.put(5, "Orange");
        System.out.println("The original map is: "+ colors);
        //Remove 1 color and print map
        colors.remove(4);
        System.out.println("After removing yellow "+ colors);
        //Check if Orange exists
        if(colors.containsValue("Orange")){
            System.out.println(" Orange is present in the Map");
        }
        else{
            System.out.println("Orange is not present in the Map");
        }
        System.out.println("Size of the map is : "  + colors.size());
     }
}
