package module09;

public class Main {
    public static void main(String[] args) {
        PaymentMethod p1 = new CreditCardPayment();
        PaymentMethod p2 = new BkashPayment();

        p1.pay(1000);
        p2.pay(1000);
    }
}
