package org.abbtech.Tasks.Task8.AbstractFactoryPatterns.Version2;

public class AsusProducer extends AbstractFactory{
    @Override
    Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    Monitor createMonitor() {
        return new AsusMonitor();
    }
}
