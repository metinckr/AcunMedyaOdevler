package İkinciHaftaOdev;

import java.util.Arrays;

public class onuncuOdev {
    public static void main(String[] args) {
        //Arrays.sort() Bu metod, diziyi sıralamak için kullanılır. Diziyi artan sırada sıralar.
        int[] dizi = {5, 3, 1, 4, 2};
        System.out.println("Sıralanmış Dizi:");
        Arrays.sort(dizi);
        for (int i : dizi) {
            System.out.print(i + " ");
        }

        //Arrays.binarySearch() Bu metod, dizi içerisinde aranan değerin ilk bulunduğu indeksi döndürür.
        int arananDeger = 4;
        int index = Arrays.binarySearch(dizi, arananDeger);
        System.out.println("\nAranan Değerin İndexi: " + index);

        //Arrays.copyOfRange() Bu metod, belirli bir dizinin bir alt dizisini kopyalamak için kullanılır. Başlangıç (inclusive) ve bitiş (exclusive) indekslerini belirtmeniz gerekir.
        int[] numbers = {1, 2, 3, 4, 5};
        int[] subArray = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("Alt dizi: " + Arrays.toString(subArray));

        //Arrays.equals() Bu metod, iki dizinin eşit olup olmadığını kontrol eder. Eğer her iki dizinin elemanları ve sıraları aynıysa true döner.
        int[] numbers1 = {4, 7, 9};
        int[] numbers2 = {4, 7, 9};
        boolean isEqual = Arrays.equals(numbers1, numbers2);
        System.out.println("Diziler eşit mi: " + isEqual);

        //Arrays.fill() Bu metod, belirli bir diziyi veya belirli bir aralığı verilen bir değerle doldurur.
        int[] number = new int[5];
        Arrays.fill(number, 7);
        System.out.println("Doldurulmuş dizi: " + Arrays.toString(number));

    }
}
