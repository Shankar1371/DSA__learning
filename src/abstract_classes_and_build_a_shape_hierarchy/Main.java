package abstract_classes_and_build_a_shape_hierarchy;


//what is a abstarction class in java
//an abstract class is a restricted class that cannot be used to create objects to access it  and it must be only in herited
//the class that cannot be instantiated
abstract class Shape {

    //abstract method is a method that is used in abstract class and it does not have a body and the body is provided by the subclass.
    String color;

    Shape(String color){
        this.color =color;
    }

    abstract double area();

    void printcolor(){
        System.out.println("color:"+color);
    }
}

class circle extends Shape{
    double radius;
    circle(String color, double radius){
        super(color);
        this.radius=radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class rectangle extends Shape{
    double length, width;
    //as the area of the rectangle is length multiplied with the width
    rectangle(String color, double length,double width){
        super(color);
        this.length=length;
        this.width= width;
    }
    @Override
    double area() {
        return length*width;
    }
}

//i think we have to test the above code as per the requirement
public class Main{
    public static void main(String[] args){
        Shape s1= new circle("red",5);
        Shape s2= new rectangle("blue",4,6);

        s1.printcolor();
        System.out.println("area:"+s1.area());

        s2.printcolor();

        System.out.println("area:"+s2.area());
    }
}
