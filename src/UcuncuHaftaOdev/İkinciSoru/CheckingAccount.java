package UcuncuHaftaOdev.İkinciSoru;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public double calculateInterest() {
        System.out.println("Checking accounts do not earn interest.");
        return 0;
    }
}
