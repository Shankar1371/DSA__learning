package week2;

import java.util.*;

public class day11 {
    public static void mai(String[] args) {
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


        //the last question for toady
       // Sort a HashMap<String, Integer> by Value
        //here the value is the integer and the key value is the string
        //first lets  create the hashmap that contains the details
        HashMap<String, Integer> dd=new HashMap<>();
        //keeping the valuesmarks.
        dd.put("A", 85);
        dd.put("B", 92);
        dd.put("C", 78);
        //what is the easiest we can create a list called sorted with the hashmap as the input
        List<Map.Entry<String,Integer>> sorted=new ArrayList<>(dd.entrySet());//each set in this is an entry in the list that has been created
        sorted.sort((a,b)-> b.getValue()- a.getValue());//this is the lamda function that we are using that compares a with b value on what is great

        for (Map.Entry<String, Integer> entry : sorted) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }



        //Given an array of strings strs, group the anagrams together. You can return the answer in any order.
        //
        //
        //
        //Example 1:
        //
        //Input: strs = ["eat","tea","tan","ate","nat","bat"]
        //
        //Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        //
        //Explanation:
        //
        //There is no string in strs that can be rearranged to form "bat".
        //The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
        //The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
        //Example 2:
        //
        //Input: strs = [""]
        //
        //Output: [[""]]
        //
        //Example 3:
        //
        //Input: strs = ["a"]
        //
        //Output: [["a"]]
        //
        //
        //
        //Constraints:
        //
        //1 <= strs.length <= 104
        //0 <= strs[i].length <= 100
        //strs[i] consists of lowercase English letters.

        class Solution {
            public List<List<String>> groupAnagrams(String[] strs) {
                HashMap<String,List<String>> mowa=new HashMap<>();
                //now we need to create a loop for the traversing to the sting array
                for(String m:strs){
                    //now we need to create a character array for all the characters that have been
                    char[] c = m.toCharArray();
                    Arrays.sort(c);
                    //now we need to sort the characters
                    String sorted=new String(c);
                    //here we place that dorted string into the hashmap
                    mowa.putIfAbsent(sorted,new ArrayList<>());
                    mowa.get(sorted).add(m);
                }
                return new ArrayList<>(mowa.values());
            }
        }
    }
}
