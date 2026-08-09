package module09;

public class BkashPayment extends PaymentMethod {
    @Override
    public void pay(double amount){
        System.out.println("Paying with Bkash....");
    }
}
