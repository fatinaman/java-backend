package module11;

public class EmailNotifier implements Notifier, Loggable {
    @Override
    public void send(String message){
        System.out.printf("Sending message via email ---> %s%n", message);
    }
    @Override
    public void log(){
        System.out.println("logging in");
    }
}
