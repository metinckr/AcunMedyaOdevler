package İkinciHaftaOdev;

import java.util.ArrayList;
import java.util.Scanner;

public class yedinciOdev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        list.add("İstanbul");
        list.add("Ankara");
        list.add("Antalya");
        list.add("İzmir");
        list.add("Giresun");

        System.out.println("Şehir ismi giriniz :");
        String cityName = scanner.nextLine();
        if (list.contains(cityName)) {
            int index = list.indexOf(cityName);
            System.out.println("Şehir listede var ve indeksi: " + index);
        } else {
            System.out.println("Şehir listede yok.");
        }

    }
}
