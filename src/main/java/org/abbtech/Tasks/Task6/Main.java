package org.abbtech.Tasks.Task6;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*Service obyektindəndə rahat metodlar çağırıla bilər (Daha clean görünür)*/

//         Service service = new Service();
//         service.addPartTimeEmployee("ilyas",22,12,3.6);
//        service.addPartTimeEmployee("Rufet",22,12,5.6);
//        service.addPartTimeEmployee("islam",1,12,1.6);
//
//        service.getTwoYearsOfexpEmployeeList();
//        service.getMaxMinSalaries();

        PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee("Ilyas",12,9,5.5);
        PartTimeEmployee partTimeEmployee2 = new PartTimeEmployee("Faiq",5,7,5.5);
        PartTimeEmployee partTimeEmployee3 = new PartTimeEmployee("HIkmet",1,5,5.5);
        PartTimeEmployee partTimeEmployee4 = new PartTimeEmployee("Nazim",3,12,5.5);

        FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee("Rafiq",4,250);
        FullTimeEmployee fullTimeEmployee2 = new FullTimeEmployee("Nazim",5,900);
        FullTimeEmployee fullTimeEmployee3 = new FullTimeEmployee("Jeff",1,90);
        FullTimeEmployee fullTimeEmployee4 = new FullTimeEmployee("John",7,1500);


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(partTimeEmployee1);
        employeeList.add(partTimeEmployee2);
        employeeList.add(partTimeEmployee3);
        employeeList.add(partTimeEmployee4);
        employeeList.add(fullTimeEmployee1);
        employeeList.add(fullTimeEmployee2);
        employeeList.add(fullTimeEmployee3);
        employeeList.add(fullTimeEmployee4);


        //2 ILDEN CHOX OLANLAR YENI LISTE YIGHILA BILER
       // List<Employee> twoYearsOfexpEmployeeList = new ArrayList<>();

//        for (Employee e: employeeList
//             ) {
//            if (e.getExperience()>2){
//                twoYearsOfexpEmployeeList.add(e);
//            }
//        }



        for (int i =0; i<employeeList.size();i++){
            if (employeeList.get(i).getExperience()<=2){
                employeeList.remove(i);
            }
        }

        for (Employee e: employeeList
             ) {
            System.out.println("Employee with more than 2 y.o of exp: "+ e.getName());
        }
        System.out.println();
        Collections.sort(employeeList);



//        for (Employee e: twoYearsOfexpEmployeeList
//             ) {
//            System.out.println("Employee with more than 2 y.o of exp: "+ e.getName());
//        }
//        System.out.println();
//        Collections.sort(twoYearsOfexpEmployeeList);


        //EN CHOX VE EN AZ MAASH ALANI MAPDA YADDA SAXLIYIRIQ
        Map<String,Double> map = new HashMap<>();
        map.put("MaxSalary",employeeList.get(employeeList.size()-1).getSalary());
        System.out.println("maximum salary among employees is "+map.get("MaxSalary"));
        map.put("MinSalary",employeeList.get(0).getSalary());
        System.out.println("minimum salary among employees is "+map.get("MinSalary"));
    }
}
