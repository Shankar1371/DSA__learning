import java.util.Scanner;

// lets go with OOP(object oriented programming in java
//class
/*
class defines the structure and behaviour  for creating objects.

object is an instance of a class. when the class is created no memory is allocated  but when the object is intaiated then the memory is allocated

Constructor is a special method that automatically calls when the object of that class are created

new is used for creating the object of a class
 */
public class Student {
    String name;
    int rollNumber;
    int[] marks;

    public Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    //lets calculate the average of the marks
    public double calculateaverage() {
        //how to calculate the average
        //first sum and then dicing them by how many marks
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return (double) sum / marks.length;
    }

    //lets print the report card
    public void reportcard() {
        System.out.println("Student: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Marks:");
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println("grade" + calculategrade());
    }

    public String calculategrade() {
        double avg = calculateaverage();
        if (avg >= 90) return "A+";
        else if (avg >= 80) return "A";
        else if (avg >= 70) return "B";
        else if (avg >= 60) return "C";
        else return "F";
    }
}
