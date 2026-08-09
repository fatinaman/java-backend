package module12;

public class Main {

    public static void main(String[] args) {
        PaymentService payment = new BkashPaymentService();

        NotificationService notification = new EmailNotificationService();

        OrderService orderService =
        new OrderService(
            payment,
            notification
        );

        orderService.checkout(1500);

        new OrderService(new CreditCardPaymentService(),new EmailNotificationService()).checkout(2300);
    }
}