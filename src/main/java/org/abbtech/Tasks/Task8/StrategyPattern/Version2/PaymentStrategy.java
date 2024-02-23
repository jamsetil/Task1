package org.abbtech.Tasks.Task8.StrategyPattern.Version2;

public interface PaymentStrategy {

    void collectPaymentDetails();
    void validatePaymentDetails();
    void pay(int amount);
}
