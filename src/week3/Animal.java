package week3;
//here we are creating a simple polymorphism and method overriding
public class Animal {
    public void sound(){
        System.out.println("the animal takes whatever sound");
    }
}
//now i will create dog and cat class to override the function called sound
class dog extends Animal{
        @Override
        public void sound(){
            System.out.println("bark bark");
        }
}
//extends function is used to import the main class to the subclass
// and override is used to override the main class function
class cat extends Animal{
    @Override
    public void sound(){
        System.out.println("meow");
    }
}


