package İkinciHaftaOdev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sekizinciSoru {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i <10;i++) {
            System.out.print(i+1 +". sayıyı giriniz :");
            int number = scanner.nextInt();
            numbers.add(number);
        }
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("Listenin en büyük elemanı: " + max);
        System.out.println("Listenin en küçük elemanı: " + min);
    }
}
