package module12;

public class CreditCardPaymentService implements PaymentService {
    public void pay(double paymentAmount){
        System.out.printf("Paying %.2f $ using Credit card..%n", paymentAmount);
    }
}