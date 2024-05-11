package OCP.payment;

public class PayPalPaymentProcessor  implements PaymentProcessor{
    @Override
    public void processPayment() {
        System.out.println("PayPal payment");
    }
}
