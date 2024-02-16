package org.abbtech.Tasks.Task6;

public class FullTimeEmployee extends Employee{

    private  double salary;
    public FullTimeEmployee(String name, int experience,double salary) {
        super(name, experience);
        this.salary=salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }
}
