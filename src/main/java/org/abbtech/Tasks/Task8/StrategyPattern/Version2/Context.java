package org.abbtech.Tasks.Task8.StrategyPattern.Version2;

public class Context {
    PaymentStrategy paymentStrategy;

    Context (PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }
}
