package module12;

public class BkashPaymentService implements PaymentService {
    public void pay(double paymentAmount){
        System.out.printf("Paying %.2f $ using Bkash..%n", paymentAmount);
    }
}