package OCP.payment;

public class BankTransferPaymentProcessor  implements PaymentProcessor{
    @Override
    public void processPayment() {
        System.out.println("Bank transfer payment");
    }
}
