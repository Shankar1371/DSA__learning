package week2;

import java.util.HashMap;
import java.util.HashSet;

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

        //we need to find a duplicate Array in hashset
        //firstly taking an array as an input
        int arr[]={1,2,3,4,2,5};
        //now lets create a hash
        HashSet<Integer> chusa=new HashSet<>();
        //now after creating a for loop
        for(int i:arr){
            //this will iterate
            if(!chusa.add(i)){//this will find the number weather there in the arr if there is a duplicate it will let pass
                System.out.println("the duplicate pound="+ i);
            }
        }
        //now we are doing a word count from a sentence
        //so we need to get how many words are there in ine sentence
        String sen="java is easy and java is powerful";
        //now we need to make an array to solve the program
        String[] senar= sen.split(" ");
        //the above line makes an array that divides the sentence to array that are divided with the space.

        HashMap<String,Integer> co=new HashMap<>();
        for(String word:senar){
            co.put(word,co.getOrDefault(word,0)+1);
        }
        System.out.println(co);

    }
}
/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.



Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 */
class solution{// so here we are given two elements that needs to get the intersection value from
    public static int[] intersection(int arr1[],int arr2[]){
        HashSet<Integer> newarr1=new HashSet<>();
        //then place the first array into the hashset so that it will be easy to compare
        for(int i:arr1){
            newarr1.add(i);
        }
        //after adding the elements into the hash arry we compare the hashset with the elements with second arr2
        //here we create an another hashset to solve this problem and add the elements that are common into the same array
        HashSet<Integer> compare=new HashSet<>();
        for(int i:arr2){
            if(newarr1.contains(i)){
                compare.add(i);
            }
        }
        //after that we need to add the elements from the hash set into the array and return it.\
        int [] retarr=new int[compare.size()];
        //here we cant change the index in the below loop so we need to change the index
        int index=0;
        for(int m:compare){
            index++;//this will increase the index after the loop
            retarr[index]=m;
        }
        return retarr;
    }
}
