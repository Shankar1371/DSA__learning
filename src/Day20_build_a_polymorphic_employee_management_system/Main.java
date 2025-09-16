package Day20_build_a_polymorphic_employee_management_system;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Employee> employees=new ArrayList<>();
    //this takes the list of the emeplyess
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args){
        int choice;
        do{
            System.out.println("\n Employee Management System");
            System.out.println("1. Add manager");
            System.out.println("2. Add developer");
            System.out.println("3. View All Employees");
            System.out.println("4. exit");
            System.out.println("Enter Your choice");
            //we gonna have a choice
            choice= sc.nextInt();//and after taking the choice we give the exact funtion that gives the output
        }
        //this is a do while loop that is used
        switch (choice){
            case 1 -> addManager();
            case 2 -> addDeveloper();
            case 3 -> viewEmployess();
            case 4 -> System.out.println("Exiting..");
        }
    }
}
