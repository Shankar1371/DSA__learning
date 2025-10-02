package day21_exception_handling;

//today we are learning about the exceptions that happen in  java that happen unexpectedly
// and how we are handling them
// try - block the test code
//catch  - block to handle exception
//finally - always runs that is used for cleanup
//throw --used to throw manually the exception
// throws -- declares that a method  might throw and error


class Dividetest {
    public static void mn(String[] args){
        try{
            int a=10,b=0;
            int result=a/b;
            System.out.println("result="+result);
        } catch (ArithmeticException e)
        {
            System.out.println("cannot divide the number by 0"+e.getMessage());

        }finally {
            System.out.println("finally the division is complete");
        }
    }
}

//now we are gonna use NUll pointer handling in java
//what is null pointer
//null pointer is that does not point to a valid memory location or object but instead holds a special , typically zero valued and address to indicate the invalidty
 class Nulltest{
    public static void nopr(String[] args){
        try{
            String s=null;
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.out.println("Null value:"+ e.getMessage());
        }
    }
}

//custom exception like with throw and throws
class AgeException extends Exception {
    AgeException(String msg){
        super(msg);
    }
}

public class voter{
    public static void checkAge(int age) throws AgeException{
        if(age<18){
            throw new AgeException("underage");
        }
        else{
            System.out.println("eligible");
        }

    }

    public static void main(String[] args){
        try{
            checkAge(16);
        }catch (AgeException e){
            System.out.println("error"+e.getMessage());
        }
    }
}

