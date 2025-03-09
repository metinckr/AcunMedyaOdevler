package odev3.ınterfaceornek2;

public class EmailNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("E-posta gönderildi: " + message);
    }

    @Override
    public String getNotificationType() {
        return "E-posta";
    }
}
