package odev3.İkinciSoru;

public abstract class BankAccount {
    String accountHolder;
    double Balance;

    public double getBalance() {
        return Balance;
    }


    public BankAccount(String accountHolder, double balance) {
        accountHolder = accountHolder;
        Balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
    public abstract double calculateInterest();
}
