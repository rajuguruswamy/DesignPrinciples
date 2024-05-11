package OCP.payment;

public class CryptocurrencyPayment implements PaymentProcessor{
    @Override
    public void processPayment() {
        System.out.println("Cryptocurrency payment");
    }
}
