package OCP;

import OCP.payment.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println("Open/Closed Principle (OCP)");
        PaymentProcessor p1 = new CreditCardPaymentProcessor();
        PaymentProcessor p2 = new PayPalPaymentProcessor();
        PaymentProcessor p3 = new CryptocurrencyPayment();
        PaymentProcessor p4 = new BankTransferPaymentProcessor();
        p1.processPayment();
        p2.processPayment();
        p3.processPayment();
        p4.processPayment();

    }

}
