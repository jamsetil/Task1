package org.abbtech.Tasks.Task8.StrategyPattern.Version1;

public class Context {
    Strategy strategy;
    Context(Strategy strategy){
        this.strategy=strategy;
    }

    void executeStrategy(int a,int b){
        strategy.doOperation(a,b);
    }
}
