package org.abbtech.Tasks.Task11.livelock;

public class Person {
    String name;
    Hall hall;
    public Person(String name,Hall hall) {
        this.name = name;
        this.hall=hall;
    }

    boolean isBlocked=true;

    public synchronized void kolidordaUzUzeGelir(Person person) throws InterruptedException {
        if (isBlocked){

            yolVer(person);
        }else {
            hall.passedHall= this.name;
            System.out.println(this.name+" kolidordan kechdi");
        }
    }
    public synchronized void yolVer(Person person) throws InterruptedException {
        while (isBlocked){
            hall.passedHall= person.name;
            System.out.println(person.name+"Chekilir qiraga");
            if (hall.passedHall.equals(this)) {
                isBlocked = false;
                break;
            }
            wait(1000);
        }
    }
}
