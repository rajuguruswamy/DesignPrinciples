package OCP.payment;

public class CreditCardPaymentProcessor  implements  PaymentProcessor{
    @Override
    public void processPayment() {
        System.out.println("Credit card payment");
    }
}
