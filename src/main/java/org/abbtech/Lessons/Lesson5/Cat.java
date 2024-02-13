package org.abbtech.Lessons.Lesson5;

public class Cat extends Mammal{
    @Override
    public void makeSound() {
        System.out.println("cat meows");
    }

    @Override
    void describe() {
        System.out.println("cat is not human frienly");
    }
}
