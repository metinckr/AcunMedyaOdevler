package odev3.InterfaceOrnek;

public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCardPayment();
        System.out.println(creditCard.getPaymentDetails());
        creditCard.processPayment(100000.50);

        PaymentMethod digitalWallet = new DigitalWalletPayment();
        System.out.println(digitalWallet.getPaymentDetails());
        digitalWallet.processPayment(125547.50);

        System.out.println("Ödemeler başarıyla tamamlandı!");
    }
}
