package org.abbtech.Tasks.Task8.StrategyPattern.Version1;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationSubtract());
        context.executeStrategy(4,7);
    }
}
