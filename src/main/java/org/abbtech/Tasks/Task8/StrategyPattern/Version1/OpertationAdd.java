package org.abbtech.Tasks.Task8.StrategyPattern.Version1;

public class OpertationAdd implements Strategy{
    @Override
    public void doOperation(int a, int b) {
        System.out.println("adding operation: "+(a+b));
    }
}
