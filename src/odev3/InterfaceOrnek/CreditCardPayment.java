package odev3.InterfaceOrnek;

public class CreditCardPayment implements PaymentMethod {


    @Override
    public void processPayment(double amount) {
        System.out.println("Kredi kartıyla " + amount + " TL ödendi.");
    }

    @Override
    public String getPaymentType() {
        return "Kredi Kartı: XXXX-XXXX-XXXX-4578";
    }

    @Override
    public boolean getPaymentDetails() {
        return false;
    }
}
