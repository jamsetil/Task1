package org.abbtech.Lesson5;

public class AnimalModel {
    public static void main(String[] args) {
        Mammal dog = new Dog();
        Cat cat = new Cat();


        dog.makeSound();
        dog.describe();
        cat.makeSound();
        cat.describe();

    }

}
