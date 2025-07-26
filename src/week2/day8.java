package week2;

import java.util.Scanner;

public class day8 {
    public static void day8(String[] args){
        Scanner sc=new Scanner(System.in);
        //lets go with the reversing a string
        String name="shankar";
        StringBuilder rev=new StringBuilder(name).reverse();
        System.out.println("reversed="+rev);
        //check weather the give name is palindrome
        //for example of palindrome is the word when reversed sounds the same
        //like madam rev madam
        System.out.println("Enter the name to check the palindrome=");
        String pali=sc.nextLine();
        //now we got the name you can just reverse then name and store that to find that weather the given name is
        //System.out.println("palindrome="+palindrome(pali));

        //counting the vowels and consonants
        String s="The java programming language";
        //first lets initate the vowels and consonants
        int vowels=0;
        int consonants=0;
        s.toLowerCase();
        for(char c:s.toCharArray()){
            if("aeiou".indexOf(c)!=-1){
                vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("vowels="+vowels+"consanats="+consonants);

    }

    private static boolean palindrome(String pali) {
        //this checks weather the name is palindrome or not
        int left=0;
        int right=pali.length()-1;
        //here we iterate a loop till we get the palindrome statement
        while(left<right){
            if(pali.charAt(left)!=pali.charAt(right)){
                return false;
            }
            left++;right--;
        }
        return true;
    }
}
