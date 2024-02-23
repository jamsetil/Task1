package org.abbtech.Tasks.Task8.StrategyPattern.Version2;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new PaymentByCreditCard());
        context.paymentStrategy.pay(12);
    }
}
