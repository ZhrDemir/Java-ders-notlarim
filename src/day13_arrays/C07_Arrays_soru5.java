package day13_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_Arrays_soru5 {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize donduren bir method olusturun.



      String [] kullanicidanAlinanArray = stringArrayOlustur();
        System.out.println(Arrays.toString(kullanicidanAlinanArray));

      }
      public static String[] stringArrayOlustur(){

          Scanner scanner = new Scanner(System.in);
          System.out.println("Array'in uzunluğunu giriniz.");
          int arrlength = scanner.nextInt();

          String [] kullaniciArrayi = new String[arrlength]; // orn 5 [null, null, null, null, null
          scanner= new Scanner(System.in);

          for (int i = 0; i < kullaniciArrayi.length ; i++) {
              System.out.println("Array'e eklemek için bir isim söyleyin");
              kullaniciArrayi[i] = scanner.nextLine();

          }
          return kullaniciArrayi;
      }
}
