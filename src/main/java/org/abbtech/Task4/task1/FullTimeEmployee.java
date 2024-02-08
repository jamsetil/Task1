package org.abbtech.Task4.task1;

public class FullTimeEmployee implements Employee{

    private String name;
    private int ID;

    private double monthlySalary;


    public FullTimeEmployee(String name, int ID, double monthlySalary) {
        this.name = name;
        this.ID = ID;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Salary of full time empoloyee is: "+monthlySalary);
        System.out.println();
    }

    @Override
    public void displayDetails() {
        System.out.println("Details of full time employee: "+"\nId: "+this.ID+"\nName: "+this.name+"\nSalary: "+monthlySalary);
        System.out.println();
    }
}
