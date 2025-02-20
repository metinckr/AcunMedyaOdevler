package İlkHaftaÖdev;

import java.util.Scanner;

public class Öğrenci_Ders_Notları_ve_Geçme_Durumu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int highestGrade=Integer.MAX_VALUE;
        int lowestGrade=Integer.MIN_VALUE;
        int[] grades = new int[5];
        int average =0;
        int sum =0;
        boolean lowGrade=false;
        for (int i=0; i<grades.length; i++) {
            System.out.println("Ders notlarını giriniz : ");
            grades[i] = scanner.nextInt();
            sum =grades[i] + sum;
            if (grades[i]>=highestGrade){
                highestGrade=grades[i];
            }if (grades[i]<=lowestGrade){
                lowestGrade=grades[i];
            }if (grades[i]<30){
                lowGrade=true;
            }
        }
        average=sum/grades.length;
        System.out.println("Not ortalamsı : "+average);
        if (average>50){
            System.out.println("Dersi geçtiniz");
        }else {
            System.out.println("Dersten kaldınız");
        }
        System.out.println("En yüksek not : "+highestGrade);
        System.out.println("En düşük not : "+lowestGrade);
        if (lowGrade) {
            System.out.println("Uyarı: Düşük not aldığınız dersler var!");
        }

    }
}
