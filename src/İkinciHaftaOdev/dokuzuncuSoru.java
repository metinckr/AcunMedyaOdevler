package İkinciHaftaOdev;

import java.util.ArrayList;

public class dokuzuncuSoru {
    public static void main(String[] args) {
        //get() içindeki belirli bir indeksdeki elemanı döndürür.
        ArrayList<String> list = new ArrayList<String>();
        list.add("Adana Kebap");
        list.add("Lahmacun");
        list.add("Pizza");
        String food = list.get(1);
        System.out.println(food);

        //set() ile belirli bir indeksdeki elemanı değiştirmek için kullanılır.
        list.set(1, "Tavuklu Kebap");
        System.out.println(list.get(1));

        //remove() ile bir elemanı silmek için kullanılır.
        list.remove(1);
        System.out.println(list);

        //size() ile listenin eleman sayısını döndürür.
        System.out.println("Listenin eleman sayısı: " + list.size());

        //clear() ile listenin tüm elemanlarını siler.
        list.clear();
        System.out.println(list);
    }
}
