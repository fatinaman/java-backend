package module10;

public class Main {
    public static void main(String[] args) {
        PaymentMethod[] payments = {
    new CreditCardPayment(),
    new BkashPayment(),
    new CashPayment()
    };

    for (PaymentMethod payment : payments) {
        payment.pay(1000);
    }
    }
}