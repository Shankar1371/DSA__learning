package week2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class day11 {
    public static void main(String[] args) {
        //here the first program of this day is word frequecy in a system
        String sen = "java is powerful and java is easy";
        //here we got the sentence we need to split the words with space
        String[] words = sen.split(" ");//this will split the sentences into the words.
        //now we need to add those words into a hashmap
        //here we are keeping the first string and the value as integer to now  what word is used the most and the frequcy is updated in the integer

        Map<String, Integer> nip = new HashMap<>();
        //now place the words into the map
        for (String ste : words) {
            nip.put(ste, nip.getOrDefault(ste, 0) + 1);//this will add 1 to the frequency whenever we find the one
            //this gives us the frequency of the word
        }
        for (Map.Entry<String, Integer> entry : nip.entrySet()) {
            //for loop used here to move through the HashMap
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //group the words that have same first starting letter
        //we are using Map<character,list<String>>// for this
        //lets take an array of words to work on
        String[] ver = {"apple", "ant", "banana", "bat", "cat"};
        //now we need to create a hash map to store what is similar starting
        HashMap<Character, List<String>> simi=new HashMap<>();
        //now we need to iterate through the string array to get the element
        for(String s:ver){
            //this will iterate now we need to compare this
            //but before that we need to divide the character of the word
            char c=s.charAt(0);
            //sometimes this simi can be null so what should we do for that
            //the below line helps
            simi.putIfAbsent(c,new ArrayList<>());
            simi.get(c).add(s);
        }
        System.out.println(simi);
    }
}
