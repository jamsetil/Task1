package org.abbtech.Tasks.Task11.starvation;

public class Main extends Thread{
    static  int counter=1;
    public void run(){
        System.out.println(counter + "st Thread execution starts");
        System.out.println(" thread execution completes");

        counter++;
    }
    public static void main(String[] args) {
        System.out.println("Main thread started");

        Main thread1=new Main();
        thread1.setPriority(10);
        Main thread2=new Main();
        thread2.setPriority(9);
        Main thread3=new Main();
        thread3.setPriority(8);
        Main thread4=new Main();
        thread4.setPriority(7);
        Main thread5= new Main();
        thread5.setPriority(6);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        //burda starvation bash verir
        thread5.start();
        System.out.println("Main thread over");
    }


}
