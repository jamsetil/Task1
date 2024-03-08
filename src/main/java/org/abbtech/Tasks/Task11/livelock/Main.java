package org.abbtech.Tasks.Task11.livelock;

public class Main {
    public static void main(String[] args) {

        Hall hall = new Hall();
        Person personA=new Person("Ilyas",hall);
        Person personB=new Person("Faiq",hall);
        Thread person1=new Thread(()->{
            try {
                personA.kolidordaUzUzeGelir(personB);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread person2=new Thread(()->{
            try {
                personB.kolidordaUzUzeGelir(personA);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        person1.start();
        person2.start();
    }
}
