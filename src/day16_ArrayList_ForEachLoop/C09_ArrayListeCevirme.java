package day16_ArrayList_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C09_ArrayListeCevirme {
    public static void main(String[] args) {

        Integer [] arr = {3,2,5,6,7,2,8,9,0,1,2,3,4,7,5,4};
        /* uzun bir array i liste çevirmenin en kullanışlı yolu bir for loop ile
        elementleri taşımaktır.

        Arrays classında asList() methodu da array i liste çevirir.
        Ancak 2 büyük hata verir.
        1- array den çevirilen liste ekleme çıkarma gibi,
        size ı değiştiren işlemler yapamazsınız

        2- bu method array ve çevirdiği list i eşleştirir
        array de yaptığınız değişiklik liste
        listtekini arraye işler

         */

        List<Integer> sayilar = Arrays.asList(arr);

        System.out.println(("Sayilar listesi" + sayilar));

        // sayılar.add(10) ; // hata
       // sayilar.remove(3);.UnsupportedOperationException

        arr[0] = 33;
        System.out.println("Array   = " + Arrays.toString(arr));

        System.out.println("arrayi değiştirdikten sonra sayılar listesi : " + sayilar);
    }
}
