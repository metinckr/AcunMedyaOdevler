package İkinciHaftaOdev;

import java.util.Scanner;

public class birinciSoru {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Lütfen " + (i + 1) + ". sayıyı girin: ");
            numbers[i] = scanner.nextInt();
            sum = sum+numbers[i];


        }
        double average =(double) sum/numbers.length;
        System.out.println("Girilen sayıların ortalaması: " + average);

        System.out.println("50'den büyük olan elemanlar:");
        for (int number: numbers) {
            if(number>50){
                System.out.println(number);
            }
            
        }

    }
}
