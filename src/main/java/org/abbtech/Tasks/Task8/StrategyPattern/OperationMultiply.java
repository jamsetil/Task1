package org.abbtech.Tasks.Task8.StrategyPattern;

public class OperationMultiply implements Strategy{
    @Override
    public void doOperation(int a, int b) {
        System.out.println("operation multiply: "+(a*b));
    }
}
