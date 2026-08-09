package module12;

public class EmailNotificationService implements NotificationService{
    public void send(String message){
        System.out.printf("Sending Email: %s%n", message);
    }
}