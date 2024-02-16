package org.abbtech.Tasks.Task6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Service {
    private List<Employee> employeeList = new ArrayList<>();
    private List<Employee> twoYearsOfexpEmployeeList = new ArrayList<>();
    private Map<String,Double> map = new HashMap<>();
    void addPartTimeEmployee(String name,int exp,double hours,double hoursSalary){
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(name,exp,hours,hoursSalary);
        employeeList.add(partTimeEmployee);
    }

    void addFullTimeEmployee(String name,int exp,double salary){
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(name,exp,salary);
        employeeList.add(fullTimeEmployee);
    }


    void setTwoYearsOfexpEmployeeList(){
        for (Employee e: employeeList
        ) {
            if (e.getExperience()>2){
                twoYearsOfexpEmployeeList.add(e);
            }
        }


    }

    void getTwoYearsOfexpEmployeeList(){
        setTwoYearsOfexpEmployeeList();
        System.out.println("Employee with more than 2 y.o of exp: ");
        for (Employee e: twoYearsOfexpEmployeeList
        ) {
            System.out.println(e.getName());
        }

    }

    void getMaxMinSalaries(){
        setTwoYearsOfexpEmployeeList();
        map.put("MaxSalary",twoYearsOfexpEmployeeList.get(twoYearsOfexpEmployeeList.size()-1).getSalary());
        System.out.println("maximum salary among employees is "+map.get("MaxSalary"));
        map.put("MinSalary",twoYearsOfexpEmployeeList.get(0).getSalary());
        System.out.println("minimum salary among employees is "+map.get("MinSalary"));
    }


}
