package day16_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_remove {
    public static void main(String[] args) {


        List<String> isimler = new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("Ömer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Başak");


        List<String> silinecekler2 = new ArrayList<>();
        silinecekler2.add("Ercan");
        silinecekler2.add("Gülnur");

        System.out.println(isimler.remove(2));//Esra
        System.out.println(isimler);//[Deniz, Ömer, Hamza, Başak]

        System.out.println(isimler.remove("Hamza"));//true
        System.out.println(isimler);//[Deniz, Ömer, Başak]

        System.out.println(isimler.removeAll(silinecekler2));// false // isimlerde değişiklik olursa true
        System.out.println("******************");


        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(8);

        System.out.println(sayilar);// [3,2,8]

        // eğer list sayılardan oluşuyorsa
        // remove (2) yazdığımızda 2'nin element mi yoksa index mi olacağını netleştirmek gerekir.
        // java bu durumu netleştirmek için
        // sayılardan oluşan listlerde
        // yazılan sayıyı index olarak girer.

        System.out.println(sayilar.remove(2));//2.indexi bulup 8 i sildiğini söyleyecek yani 8 yazıcak
        System.out.println(sayilar); // 3,2

        // illa da obje olan 2 yi silmek istiyorsak ve index ini bilmiyorsak
        // önce silmek istediğimiz elementi bir obje yani nonprimitive olarak tanımlamalıyız

        Integer silinecekSayi = 2 ;
        System.out.println(sayilar.remove(silinecekSayi));// true
        System.out.println(sayilar);// [3]


        sayilar.clear();
        System.out.println(sayilar);//[]
    }
}
