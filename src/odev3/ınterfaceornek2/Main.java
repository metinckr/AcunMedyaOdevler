package odev3.ınterfaceornek2;

public class Main {
    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification();
        System.out.println("Bildirim Türü: " + emailNotification.getNotificationType());
        emailNotification.send("Bu bir test e-postasıdır.");

        Notification smsNotification = new SMSNotification();
        System.out.println("Bildirim Türü: " + smsNotification.getNotificationType());
        smsNotification.send("Bu bir test SMS'idir.");

        System.out.println("Tüm bildirimler başarıyla gönderildi!");
    }
}
