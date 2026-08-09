package module11;

public class SmsNotifier implements Notifier{
    @Override
    public void send(String message){
        System.out.printf("Sending message via SMS ---> %s%n", message);
    }
}
