package module10;

public class BkashPayment extends PaymentMethod {
    @Override
    public void pay(double amount){
        System.out.println("Paying with Bkash....");
    }
}
