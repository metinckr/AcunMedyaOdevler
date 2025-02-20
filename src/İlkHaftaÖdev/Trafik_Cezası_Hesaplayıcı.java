package İlkHaftaÖdev;

import java.util.Scanner;

public class Trafik_Cezası_Hesaplayıcı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speedLimit=90;
        System.out.print("Lütfen yolcu hızını girin: ");
        int speed = scanner.nextInt();

        if (speed<=speedLimit){
            System.out.println("Hız sınırı aşılmadı çezai işlem uygulanmayacaktır.");
        }if (speed>90 && speed<110){
            System.out.println("Hız sınırı aşıldı, 1000 TL cezai işlem uygulanacaktır.");
        }if (speed>=110 && speed<130){
            System.out.println("Hız sınırı aşıldı, 2000 TL cezai işlem uygulanacaktır.");
        }if (speed>130 ){
            System.out.println("Hız sınırı çok fazla aşıldı, ehliyete el konulacaktır.");
        }

    }
}
