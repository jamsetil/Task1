package org.abbtech.Tasks.Task4.task1;

public class PartTimeEmployee implements Employee{

    private String name;
    private int ID;
    private double hourlyRate;
    private double hoursWorked;



    public PartTimeEmployee(String name, int ID, double hourlyRate, double hoursWorked) {
        this.name = name;
        this.ID = ID;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;

    }


    @Override
    public void calculateSalary() {
        System.out.println("Salary of part time employee is "+ (hoursWorked*hourlyRate));
        System.out.println();
    }

    @Override
    public void displayDetails() {
        System.out.println("Details of part time employee: "+"\nId: "+this.ID+"\nName: "+this.name+"\nHourly rate"+this.hourlyRate+
        "\nHours worked: "+ hoursWorked+"\nSalary: "+(hoursWorked*hourlyRate));
    }
}
