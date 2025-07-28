package week2;

import java.util.HashMap;

public class day10 {
    public static void main(String[] args){
        //problem 1
        //frequency counter using hashmap
        String str="programming";
        HashMap<Character,Integer> freq=new HashMap<>();
        //here we have created a hashmap where the key is the character and  Interger is the number added to the key.
        //we need to iterate
        for( char c:str.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
            //here we take iterate and when we get the value we just add it to the given number that we got from before
        }
        System.out.println("Character Frequencies:"+ freq);
    }
}
