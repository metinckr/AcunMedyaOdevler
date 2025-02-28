package İkinciHaftaOdev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class dorduncuSoru {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.print("Sayı girin: ");
        System.out.println("Lütfen 10 adet tam sayı giriniz:");
        for (int i = 0; i < 10; i++) {
            numbers.add(scanner.nextInt());
        }
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);

    }
}
