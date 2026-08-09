package module10;

public class CashPayment extends PaymentMethod {
    @Override
    public void pay(double amount){
        System.out.println("Paying in cash ...");
    }
}
