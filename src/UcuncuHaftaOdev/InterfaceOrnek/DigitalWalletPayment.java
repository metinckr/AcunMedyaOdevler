package UcuncuHaftaOdev.InterfaceOrnek;

public class DigitalWalletPayment implements PaymentMethod{
    @Override
    public void processPayment(double amount) {
        System.out.println("Dijital cüzdan ile " + amount + " TL ödendi.");
    }

    @Override
    public String getPaymentType() {
        return "Dijital Cüzdan: user@wallet.com";
    }

    @Override
    public boolean getPaymentDetails() {
        return false;
    }
}
