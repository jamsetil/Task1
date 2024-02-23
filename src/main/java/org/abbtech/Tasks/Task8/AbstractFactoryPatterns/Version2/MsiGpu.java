package org.abbtech.Tasks.Task8.AbstractFactoryPatterns.Version2;

public class MsiGpu implements Gpu{
    @Override
    public void assemble() {
        System.out.println("Assembling msi gpu");
    }
}
