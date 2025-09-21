package Day20_build_a_polymorphic_employee_management_system;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Employee> employees = new ArrayList<>();
    //this takes the list of the emeplyess
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n Employee Management System");
            System.out.println("1. Add manager");
            System.out.println("2. Add developer");
            System.out.println("3. View All Employees");
            System.out.println("4. exit");
            System.out.println("Enter Your choice");
            //we gonna have a choice
            choice = sc.nextInt();//and after taking the choice we give the exact funtion that gives the output
            //this is a do while loop that is used
            switch (choice) {//using switch case to know what is the choice of the person
                case 1 -> addManager();
                case 2 -> addDeveloper();
                case 3 -> viewEmployess();
                case 4 -> System.out.println("Exiting..");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 4);//we have used do while loop for taking an option for the system
    }

    private static void addDeveloper() {
        //we have to write  some code to add developer to the bunch of employess we have
        System.out.println("Enter the name of the developer:");
        sc.nextLine();//this line clears the buffer of the system
        String name=sc.nextLine();
        System.out.println("Enter the id:");
        int id=sc.nextInt();
        System.out.println("Enter the base salary:");
        double salary= sc.nextDouble();
        //here we have to write a code where the user can write the overtime hours and over time rate
        System.out.println("Enter the Overtime hours:");
        int hours=sc.nextInt();
        System.out.println("Enter the overtime rate of the developer:");
        double rate=sc.nextDouble();

        //and after getting all the details just add that to the employee list
        employees.add(new Developer(name,id,salary,hours,rate));
    }

    private static void addManager() {
        //now lets write the code for the manager
        //the fields are same id,name and salary and along with thatwe have to write the bonus for the manager
        System.out.println("Enter the name of the manager:");
        sc.nextLine();
        String name= sc.nextLine();
        System.out.println("Enter the id:");
        int id= sc.nextInt();
        System.out.println("Enter the base salary:");
        double salary= sc.nextDouble();
        System.out.println("Enter the bonus:");
        double bonus= sc.nextDouble();

        //and we have to add the array list by calling the function manager
        employees.add(new Manager(name,id,salary,bonus));
    }

    static void viewEmployess(){
        if(employees.isEmpty()){
            System.out.println("There are no employess added yet");
        }
        else{
            for(Employee e: employees){
                e.displayDetails();
                System.out.println("Total salary:$"+e.caluclateSalary());
            }
        }
    }
}
