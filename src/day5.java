import java.util.Scanner;

public class day5 {
    public  static void day5(String[] args) {
        //now create an object for the class student
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student name:");
        String name = sc.nextLine();

        System.out.println("enter the roll n.o");
        int roll = sc.nextInt();

        System.out.println("Enter number of subjects:");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        Student s1 = new Student(name, roll, marks);
        s1.reportcard();

    }
}
