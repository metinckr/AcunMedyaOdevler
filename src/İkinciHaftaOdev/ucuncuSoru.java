package İkinciHaftaOdev;

import java.net.Socket;
import java.util.Scanner;

public class ucuncuSoru {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Lütfen 10 adet tam sayı giriniz:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int positiveSum = 0;
        int negativeSum = 0;
        for (int number : numbers) {
            if (number > 0) {
                positiveSum += number;
            } else if (number < 0) {
                negativeSum += number;
            }
        }
        System.out.println("Pozitif sayıların toplamı: " + positiveSum);
        System.out.println("Negatif sayıların toplamı: " + negativeSum);
    }
}
