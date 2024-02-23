package org.abbtech.Tasks.Task8.StrategyPattern.Version2;

public class PaymentByCreditCard implements PaymentStrategy{
    @Override
    public void collectPaymentDetails() {
        System.out.println("details collected");
    }

    @Override
    public void validatePaymentDetails() {
        System.out.println("credit card digits and payment validated");
    }

    @Override
    public void pay(int amount) {
        System.out.println("paid "+amount+" by credit card");
    }
}
