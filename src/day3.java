import java.util.Scanner;

public class day3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //here our task is to take input and print an array
        int[] a=new int[5];//here i have created an array with size 5
        for(int i=0;i<5;i++){
            a[i]= sc.nextInt();
        }
        //finding max and min in an array
        //lets take the first element of an array as min and max if we find the element that is less than the element or greater we swap according to the requirementy
        int max=a[0];
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];//here we have changed the swap
            }
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("the maximum is"+max);
        System.out.println("the minimum is"+min);

        //now we will the sum of the array and average of the array
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        //and after completing that we need to find  the average of the sum
        double average=sum/a.length;//double is good to save the fractional part of the code

        System.out.println("the sum="+sum);
        System.out.println("the average="+average);


        //now we will learn how to reverse an array without changing the sum of the array
        System.out.println("the reversed array");
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }

        //sorting an array without using in built function
        //bubble sort
        for(int i=0;i<a.length;i++){
            //here we iterate once
            for(int j=0;j<a.length-i-1;j++) {//here we have written a.length-i-1 as the length reduces after one sort as one element will
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("sorted array");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
