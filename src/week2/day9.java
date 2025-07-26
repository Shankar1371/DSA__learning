package week2;

import java.util.ArrayList;

public class day9 {
    public static void main(String[] args){
        //today is about arraylist
        //add five names and print them
        ArrayList<String> names=new ArrayList<String>();
        //we have created an object called names.
        //now we need to take the names for 5
        names.add("shankar");
        names.add("roham");
        names.add("durga");
        names.add("moma");
        names.add("pulla");
        //we have added the five names here
        //now printing them
        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }
        //now we need to remove the third one out of that and print the remaining
        names.remove(2);
        System.out.println(names);
    }
}
