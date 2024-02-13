package org.abbtech.Lessons.Lesson4;

public class Person {
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    void print(){
        System.out.println("name : "+name+" age : "+age);
    }
}
