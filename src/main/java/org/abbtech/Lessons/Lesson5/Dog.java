package org.abbtech.Lessons.Lesson5;

public class Dog extends Mammal{
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    @Override
    void describe() {
        System.out.println("dog is human friendly");
    }
}
