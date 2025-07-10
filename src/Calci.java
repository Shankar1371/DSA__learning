import java.util.Scanner;
public class Calci {
    public static void calculator(String[] args) {
        //for calculator i need two inputs at first
        //we neeed a scanner class for taking the input
        Scanner sc=new Scanner(System.in);
        double a,b;
        System.out.println("Enter the first number:");
        a= sc.nextInt();//this takes input for integer
        //but the problem is i need to develop a full felged program that is helps me to do all the calculations in a cal
        //so we are going with the double
        System.out.println("Enter the second number:");
        b= sc.nextInt();

        System.out.println("what is the selection for the calculations.(+/-*)");
        //here the user can take a decision of what to use as an array
        char c=sc.next().charAt(0);
        //here the use of the above code is taking the charAT 0 i meant only the first word
        // so i am using a switch case to take a selection from the user and perform an action on it
        //but before that i need to add the result part to save the result
        double result=0;
        switch (c){
            case '*':result=a*b;break;
            case '+':result=a+b;break;
            case '-':result=a-b;break;
            case '/': result=b!=0 ? a/b:0; break;
            default:System.out.println("wrong selection");
        }
        //lastly we display the result on the main screen
        System.out.println("result="+result);
    }
}