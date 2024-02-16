package org.abbtech.Tasks.Task6;

import java.math.BigDecimal;

public abstract class Employee implements Comparable<Employee>{
    private String name;
   private int experience;

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public Employee(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public abstract double getSalary();

    @Override
    public int compareTo(Employee o) {
        if (this.getSalary()>o.getSalary()){
            return 1;
        } else if (this.getSalary()==o.getSalary()) {
            return 0;
        }else return -1;


    };
}
