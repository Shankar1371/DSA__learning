package day19_learn_java_interfaces_and_implement_multi_behaviour_logic;
//in java an interface is a blueprint for a class definh a contract of abstract methods and can also include  constants

interface Flyable{
    void fly();
}

interface Swimmable{
    void swim();
}
//multiple interface implementation
//as java can not inlcude a multiple class inheritance but we can use or implement multiple interface

class Bird implements Flyable, Swimmable{
    @Override
    public void fly() {
        System.out.println("Birds can fly");
    }

    @Override
    public void swim() {
        System.out.println("Birds can swim");
    }
}

public class Main{
    public static void main(String[] args){
        Flyable f=new Bird();
        Swimmable s=new Bird();
        //we can develop like this many forms also called as taking advantyage of polymorphisim in java

    }
}
