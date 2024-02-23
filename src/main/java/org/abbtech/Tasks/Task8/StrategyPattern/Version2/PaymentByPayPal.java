package org.abbtech.Tasks.Task8.StrategyPattern.Version2;

public class PaymentByPayPal implements PaymentStrategy{
    @Override
    public void collectPaymentDetails() {
        System.out.println("details collected via paypal");
    }

    @Override
    public void validatePaymentDetails() {
        System.out.println("payment validated via paypal");
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" paid successfully with paypal");
    }
}
