package miniproject_contact;

import java.util.ArrayList;
import java.util.Scanner;

 class notreal {
   private static ArrayList<contact> conatact=new ArrayList<>();
    private static Scanner sc=new Scanner(System.in);

    public static void mini(String[] args) {
        int choice;
        //here we give the option to the user on what to select in
        System.out.println("\n Conatact Book Menu");
        System.out.println("1.Add Contact");
        System.out.println("2.View all conatcts");
        System.out.println("3.Search Contact by name");
        System.out.println("4.Delete Contact by Name");
        System.out.println("5.exit");
        System.out.println("Choose");
        choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 5 -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid choice!");
        }
    }

}

