package İlkHaftaÖdev;

import java.util.Scanner;

public class Restoran_Sipariş_Sistemi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int totalAmount = 0;

        do {
            // Kullanıcıdan seçim alınır
            System.out.println("Lütfen bir seçenek girin:");
            System.out.println("1 - Pizza (210 TL)");
            System.out.println("2 - Çiğ Köfte (60 TL)");
            System.out.println("3 - İskender (175 TL)");
            System.out.println("4 - Adana Kebap (180 TL)");
            System.out.println("5 - Hamburger (250 TL)");
            System.out.println("6 - Siparişi Tamamla");
            System.out.println("0 - Çıkış");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Pizza eklendi");
                    totalAmount += 210;
                    break;
                case 2:
                    System.out.println("Çiğ Köfte eklendi");
                    totalAmount += 60;
                    break;
                case 3:
                    System.out.println("İskender eklendi");
                    totalAmount += 175;
                    break;
                case 4:
                    System.out.println("Adana Kebap eklendi");
                    totalAmount += 180;
                    break;
                case 5:
                    System.out.println("Hamburger eklendi");
                    totalAmount += 250;
                    break;
                case 6:
                    System.out.println("Siparişiniz tamamlandı. Toplam tutar: " + totalAmount + " TL");
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçenek! Lütfen tekrar deneyin.");
            }
        } while (choice != 0 && choice != 6); // 0 veya 6 girilene kadar döngü devam eder

        System.out.println("Toplam Hesap: " + totalAmount + " TL");
        scanner.close();

    }
}
