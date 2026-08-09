package module09;

public class CreditCardPayment extends PaymentMethod{
    @Override
    public void pay(double pay){
        System.out.println("Paying with credit card....");
    }
}
