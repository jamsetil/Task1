package org.abbtech.Tasks.Task8.AbstractFactoryPatterns.Version2;

public class MsiProducer extends AbstractFactory{
    @Override
    Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    Monitor createMonitor() {
        return new MsiMonitor();
    }
}
