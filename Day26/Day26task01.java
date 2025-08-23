package com.example;

// Strategy Pattern Example: Payments
public class Day26task01 {

    // Strategy Interface
    interface PaymentStrategy {
        void process(double price);
    }

    // Concrete Strategy - Card Payment
    static class CardPaymentConcreteStrategy implements PaymentStrategy {
        @Override
        public void process(double price) {
            System.out.println("Processing payment of ₹" + price + " using Card.");
        }
    }

    // Concrete Strategy - Cash Payment
    static class CashPaymentConcreteStrategy implements PaymentStrategy {
        @Override
        public void process(double price) {
            System.out.println("Processing payment of ₹" + price + " using Cash.");
        }
    }

    // Concrete Strategy - UPI Payment
    static class UpiPaymentConcreteStrategy implements PaymentStrategy {
        @Override
        public void process(double price) {
            System.out.println("Processing payment of ₹" + price + " using UPI.");
        }
    }

    // Context Class
    static class PaymentUsingStrategy {
        private PaymentStrategy paymentStrategy;

        public PaymentUsingStrategy(PaymentStrategy paymentStrategy) {
            this.paymentStrategy = paymentStrategy;
        }

        public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
            this.paymentStrategy = paymentStrategy;
        }

        public void process(double price) {
            paymentStrategy.process(price);
        }
    }

    // Main Method
    public static void main(String[] args) {
        System.out.println("Strategy Method Design Pattern - Behavioral DP");

        // Using Card Payment
        PaymentUsingStrategy payment = new PaymentUsingStrategy(new CardPaymentConcreteStrategy());
        payment.process(1500.00);

        // Switching to Cash Payment
        payment.setPaymentStrategy(new CashPaymentConcreteStrategy());
        payment.process(800.00);

        // Switching to UPI Payment
        payment.setPaymentStrategy(new UpiPaymentConcreteStrategy());
        payment.process(500.00);
    }
}

