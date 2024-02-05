package org.abbtech.Task3.task2;

public class Counter {

    static int instanceCount;


    Counter () {
        instanceCount++;
    }

    static int getInstanceCount() {
        return instanceCount;
    }

}


class InstanceCounter {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        System.out.println("Instances: "+Counter.getInstanceCount());

    }
}
