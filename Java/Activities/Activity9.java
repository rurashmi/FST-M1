package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String[] args){
        List<String> myList = new ArrayList<>();
        myList.add("Fruits");
        myList.add("Vegetable");
        myList.add("Lentils");
        myList.add("Spices");
        myList.add("BabyFood");
        System.out.println("Print all the objects: ");
        for(String s:myList){
            System.out.println(s);
        }
        //methods
        System.out.println("The 3rd element in the list is " + myList.get(2));
        System.out.println(" Is Diapers in the list? "+ myList.contains("Diapers"));
        System.out.println("Size of the list is " + myList.size());
        myList.remove("BabyFood");
        System.out.println("Size of the new list is " + myList.size());
    }
}
