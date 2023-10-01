package day15_MultiDimansionalArray;

import java.util.ArrayList;
import java.util.List;

public class C11_Remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("Ömer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Başak");

        // remove (silinecek object) çalıştırılınca,
        // silinecek object varsa siler ve true döndürür
        // yoksa silemez ve false döndürür.

        System.out.println(isimler);//[Deniz, Ömer, Esra, Hamza, Başak]

        System.out.println(isimler.remove("Esra"));// true

        System.out.println(isimler);// [Deniz, Ömer, Hamza, Başak]

        System.out.println(isimler.remove("ze"));//false

        isimler.remove("Ömer");
        System.out.println(isimler);// [Deniz, Hamza, Başak]


        System.out.println(isimler.remove(1));// hamza  // 1. indexteki hamzayı sileceğini söylüyor

        System.out.println(isimler);// [Deniz, Başak]

       //  isimler.remove(5); //Index 5 out of bounds for length 2

        isimler.add("İbrahim");
        isimler.add("Ercan");
        isimler.add("Azim");

        System.out.println(isimler);

        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Başak");
        silinecekler.add("Deniz");
        silinecekler.add("Azim");

        System.out.println(silinecekler);

        System.out.println(isimler.removeAll(silinecekler));//true

        System.out.println(isimler);//[İbrahim, Ercan]

        List<String> silinecekler2 = new ArrayList<>();
        silinecekler2.add("Ercan");
        silinecekler2.add("Gülnur");

        System.out.println(silinecekler2);// ercan, gülnur

        System.out.println(isimler.removeAll(silinecekler2));// true

        System.out.println(isimler);// ibrahim



    }
}
