package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random indexGen = new Random();
        System.out.println("Enter integers please");
        System.out.println("Non Integers to terminate");
        while (scan.hasNextInt()) {
            list.add(scan.nextInt());
        }
        Integer num[] = list.toArray(new Integer[5]);
        int index = indexGen.nextInt(num.length);
        System.out.println("Index value generated: "+ index);
        System.out.println("Value in array at generated  index: "+ num[index]);
        scan.close();
        }
    }
