package calculator;


//now we are gonna learn is method overloading that means the functyion name would be the same
// but the function can have different parameters that can be called by giving such parameters
class Calculator {
    //now i am gonna write a code for overloading a add function in the class calculator
    public static int add(int a, int b){
        return a+b;
    }
    public static double add(double a, double b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }

    //now let me call the function
    public  class Main{
        public static void main(String[] args){
            System.out.println(Calculator.add(2,5));
            System.out.println(Calculator.add(2.5,5.3));
            System.out.println(Calculator.add(2,5,5));

        }
    }
}
