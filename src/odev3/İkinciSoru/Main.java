package odev3.İkinciSoru;

public class Main {
    public static void main(String[] args) {

        BankAccount savingsAccount = new SavingsAccount("Metin", 1000000);
        BankAccount checkingAccount = new CheckingAccount("ALi", 5000);

        System.out.println("Vadesiz Hesap: " + savingsAccount.calculateInterest());
        System.out.println("Vadeli Hesap: " + checkingAccount.calculateInterest());

        BankAccount[] accounts = new BankAccount[2];
        accounts[0] = savingsAccount;
        accounts[1] = checkingAccount;

        for (BankAccount account : accounts) {
            System.out.println("Hesap Sahibi: " + account.getAccountHolder());
            System.out.println("Fazi: " + account.calculateInterest());
        }
    }
}
