package day23_read_write_files_using_java;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {
    public static void main(String[] args)
    {
        //here we use try catch block as we may come across file exception
        try {
            //we are taking class Filewriter so that it can be helpful to use the object of the class to write the file in the memory location
            FileWriter writer = new FileWriter("output.txt");
            writer.write("hello i am using the file writer class in java");
            //here we are using to catch the block of IO file exception
            writer.close();

        }
        catch (IOException e) {
            System.out.println("Error:"+e.getMessage());
        }
    }
}
