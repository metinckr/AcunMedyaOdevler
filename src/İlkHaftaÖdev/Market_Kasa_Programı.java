package İlkHaftaÖdev;

import java.util.Scanner;

public class Market_Kasa_Programı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstProduct =100;
        int secondProduct =300;
        int thirdProduct =80;
        int accountPayable=0;
        while (true){
            System.out.println("Lütfen Ürününüzü Seçiniz :");
            System.out.println("1)1.Ürün : "+firstProduct+ "TL");
            System.out.println("2)2.Ürün :"+secondProduct+ "TL");
            System.out.println("3)3.Ürün :"+thirdProduct+ "TL");
            System.out.println("4)Çıkış :");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    accountPayable += firstProduct;
                    break;
                case 2:
                    accountPayable += secondProduct;
                    break;
                case 3:
                    accountPayable += thirdProduct;
                    break;
                case 4:
                    System.out.println("Ödenecek hesap " + accountPayable + "TL ");
                    System.out.println("İndirim kuponunuz var mı varsa E yoksa H giriniz");
                    char discountCoupon = scanner.next().charAt(0);
                    if (discountCoupon =='E'){
                        double discount = accountPayable * 0.10;
                        accountPayable -= discount;
                        System.out.println("İndirim uygulandı yeni ödenecek tutar : "+accountPayable);
                    }else {
                        System.out.println("İndirim kuponunuz bulunmamaktadır");
                        System.out.println("Ödenecek tutar : "+accountPayable+" TL);" );
                    }
                    return;
                default:
                    System.out.println("Geçersiz Seçim Tekrar Deneyin.");
            }
        }

    }
}
