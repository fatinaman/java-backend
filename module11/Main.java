package module11;

public class Main {
    public static void main(String[] args) {
        Notifier[] notifiers = {
        new EmailNotifier(),
        new SmsNotifier() };

        for (Notifier notifier : notifiers) {
            notifier.send("Order shipped");
        }
    }
}
