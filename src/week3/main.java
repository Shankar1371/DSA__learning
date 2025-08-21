package week3;

import java.util.ArrayList;
import java.util.List;

//now lets create a main class that uses this and know about Dynamic dispatch
public class main{
    //here i have created a class that uses dynamic dispatch in java

    public static void main(String[] args)
    {
        //now lets create an object for the class animal
        Animal a=new Animal();
        //after that we need to call the function that is the that\
        a.sound();
        dog d=new dog();
        cat c=new cat();
        //here we have to use the ref
        Animal ref;
        ref=a;
        ref.sound();

        //now use the ref

        ref=d;
        ref.sound();

        ref=c;
        ref.sound();

        List<Animal> zoo=new ArrayList<>();
        zoo.add(new Animal());
        zoo.add(new Animal());
    }
}
