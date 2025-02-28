package İkinciHaftaOdev;

import java.util.ArrayList;
import java.util.Scanner;

public class besinciOdev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Bir sayı girin: ");
        for (int i = 0; i < 20; i++) {
            numbers.add(scanner.nextInt());
        }
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for (int i = 0; i<numbers.size();i++){
            if (numbers.get(i) % 2 == 0 ){
                evenNumbers.add(numbers.get(i));
            }
        }
        System.out.println(evenNumbers);
    }
}
