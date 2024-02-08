package org.abbtech.Task4.task1;

import java.util.ArrayList;
import java.util.List;

public class Task1Main {
    public static void main(String[] args) {
        //öz tiplərindədə referans verə bilərdik
     Employee fullTimeEmployee = new FullTimeEmployee("ilyas",12,1200.23);
     Employee partTimeEmployee = new PartTimeEmployee("Ceyhun",23,12,67);

        Employee[] employees = {fullTimeEmployee,partTimeEmployee};
        //veya
        List<Employee> list = new ArrayList<>();
        list.add(fullTimeEmployee);
        list.add(partTimeEmployee);

        //array formasinda
        for (Employee e:employees){
            e.calculateSalary();
            e.displayDetails();
        }

        //Collection formasinda
//        for (Employee e:list){
//            e.calculateSalary();
//            e.displayDetails();
//        }
    }
}
