package org.abbtech.Tasks.Task8.StrategyPattern.Version1;

public class OperationSubtract implements Strategy{
    @Override
    public void doOperation(int a, int b) {
        System.out.println("subtractin operation: "+(a-b));
    }
}
