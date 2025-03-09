package odev3.ınterfaceornek2;

public class SMSNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("SMS gönderildi: " + message);
    }

    @Override
    public String getNotificationType() {
        return "SMS";
    }
}
