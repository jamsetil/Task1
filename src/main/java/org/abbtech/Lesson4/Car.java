package org.abbtech.Lesson4;

public class Car {
    String model;
    int year;

    Car(String model,int year){
        this.model=model;
        this.year=year;
    }
    public void startEngine(){
        System.out.println("car "+model+" " +year+"Engine started");
    }
}
