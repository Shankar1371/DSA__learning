package Day20_build_a_polymorphic_employee_management_system;

class Manager extends Employee{
    private double bonus;

    public Manager(String name, int id, double baseSalary, double bonus){
        super(name,id,baseSalary);
        this.bonus = bonus;
    }
    @Override
    double caluclateSalary() {
        return basesalary+bonus;
    }
}

//now lets create for the developer

class Developer extends Employee{
    private int overtimehours;
    private double overtimerate;

    public Developer(String name, int id, double basesalary, int overtimehours,double overtimerate){
        super(name, id, basesalary);
        this.overtimehours=overtimehours;
        this.overtimerate=overtimerate;
    }


    @Override
    double caluclateSalary() {
        return basesalary*(overtimerate * overtimehours);
    }
}
