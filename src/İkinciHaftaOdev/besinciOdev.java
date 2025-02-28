package İkinciHaftaOdev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class besinciOdev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Lütfen kelimeleri giriniz :");
        for (int i = 0; i <10;i++) {
            list.add(scanner.nextLine());
        }
        Collections.sort(list);
        for (String line : list) {
            System.out.println(line);
        }
    }
}
