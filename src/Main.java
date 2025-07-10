import java.util.Scanner;

public  class Main{
    public static void main(String[] args){
        //palindrome 121 and the reverse number is a palindrome
        //taking an input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check palindrome or not:");
        int a=sc.nextInt();
        //save the reversed into another declared
        int reversed=0;
        //now we need to reverse a and then compare the number with each other
        //here we have to save the a into other declaration
        int copy=a;
        while(copy!= 0){
            int d=copy%10;//here it gives out the last output
            reversed=reversed*10+d;//here we multiply reversed with 10 that make 0 and then add the last digit we got from before and work as per that
            //we have one more last step that we have to reduce the last number of the copy
            copy=copy/10;
        }

        System.out.println(a==reversed?"its a pali":"not a pali");
    }
}