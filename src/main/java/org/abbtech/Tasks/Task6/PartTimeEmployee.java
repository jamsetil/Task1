package org.abbtech.Tasks.Task6;

import java.math.BigDecimal;

public class PartTimeEmployee extends Employee {


    //DOUBLE LARI BIGDECIMAL KIMIDE YAZMAQ OLAR
    private double hours;
    private double hoursSalary;

    private double salary;

    public PartTimeEmployee(String name, int experience,double hours,double hoursSalary) {
        super(name, experience);
        this.hours=hours;
        this.hoursSalary=hoursSalary;
        this.salary=hours*hoursSalary;
    }

    @Override
    public double getSalary() {
        return salary;
    }


}
