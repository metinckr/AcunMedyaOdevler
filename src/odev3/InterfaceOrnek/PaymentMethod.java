package odev3.InterfaceOrnek;

public interface PaymentMethod {
    void processPayment(double amount);
    String getPaymentType();

    boolean getPaymentDetails();
}
