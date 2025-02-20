package İlkHaftaÖdev;

import java.util.Scanner;

public class ATM_Simülasyonu {
    public static void main(String[] args) {
        int userPassword =1683;
        int balance =10000;
        System.out.print("Şifrenizi Giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int password = scanner.nextInt();
        if (password == userPassword){
            while(true){
                System.out.println("1.Bakiyeyi Görüntüle");
                System.out.println("2.Para Yatırma");
                System.out.println("3.Para Çekme");
                System.out.println("4.Çıkış : ");
                System.out.println("İşleminizi Seçiniz : ");
                int choice = scanner.nextInt();
                if (choice ==1){
                    System.out.println("Bakiyeniz : " + balance);
                }if (choice==2){
                    System.out.println("Yatacağınız Miktarı Giriniz : ");
                    int amount = scanner.nextInt();
                    balance+=amount;
                    System.out.println("Yatırılan Miktar : " + amount);
                    System.out.println("Yeni Bakiyeniz : " + balance);
                }if (choice==3){
                    System.out.print("Çekeceğiniz Miktarı Giriniz : ");
                    int amount = scanner.nextInt();
                    if (balance>=amount){
                        balance-=amount;
                        System.out.println("Çekilen Miktar : " + amount);
                        System.out.println("Yeni Bakiyeniz : " + balance);
                    }else{
                        System.out.println("Yetersiz Bakiye!");
                    }
                }if (choice==4){
                    System.out.println("Çıkış Yapıldı!");
                    break;
                }
            }
        }else {
            System.out.println("Şifre Yanlış Tekrar Deneyiniz!");
        }

    }
}
