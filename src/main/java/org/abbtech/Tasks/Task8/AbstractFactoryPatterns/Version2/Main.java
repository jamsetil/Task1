package org.abbtech.Tasks.Task8.AbstractFactoryPatterns.Version2;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new MsiProducer();
       Gpu gpu =  factory.createGpu();
       gpu.assemble();

       AbstractFactory factory2 = new AsusProducer();
       Monitor monitor = factory2.createMonitor();
       monitor.assemble();
    }
}
