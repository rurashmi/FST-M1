package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<String>();
        //Adding element
        hs.add("Salt");
        hs.add("Sugar");
        hs.add("Tea");
        hs.add("Coffee");
        hs.add("Milk");
        hs.add("Jaggery");
        //Print hash set
        System.out.println("Original hash set is: " + hs);
        System.out.println("Size of the hash set is: " + hs.size());
        //Remove object
        hs.remove("Jaggery");
        //Remove object that is not present
        if(hs.remove("Jaggery")){
            System.out.println("Jaggery is removed from the set");
        }
        else{
            System.out.println("Jaggery is not present in the set");
        }
        //Search for Object
        System.out.println("Check if Milk is present in the set: " + hs.contains("Milk"));
        System.out.println("Updated set is: " + hs);

    }
}
