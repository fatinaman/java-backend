package module12;

public class OrderService implements PaymentService, NotificationService{
    PaymentService paymentMedium;
    NotificationService notificationMendium;

    OrderService(PaymentService paymentMeidum, NotificationService notificationOption){
        this.paymentMedium = paymentMeidum;
        this.notificationMendium = notificationOption;
    }

    public void pay(double amount){
        this.paymentMedium.pay(amount);
    }

    public void send(String message){
        this.notificationMendium.send(message);
    }

    public void checkout(double amount){
        this.pay(amount);
        this.send("Order confirmed.");
    }

}