package Day20_build_a_polymorphic_employee_management_system;

abstract class Employee {
    // abstract class is a restricted class that cannot be initiated directly. It is just a bluprint for the base class
    protected String name;
    protected int id;
    protected double basesalary;
    // we are creating a constructor for the class employee . so that it can be called when ever the class is called .
    //but the thing  is we cannot create a object for the class

    //so the main reason for using the constructor for the abstract class is that we can enforce the initialization of its own fields and properties
    public Employee(String name, int id, Double basesalary)
    {
        this.name=name;
        this.id=id;
        this.basesalary=basesalary;
    }

    abstract double caluclateSalary();
// above line is called abstract method that is declared but does not have body or implementation.
    //it just acts as a placeholder for a function that must be defined in the subclass that takes the blueprint of the function

    public void displayDetails(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Base salary $:"+basesalary);
    }
}
