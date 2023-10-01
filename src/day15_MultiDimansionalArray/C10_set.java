package day15_MultiDimansionalArray;

import java.util.ArrayList;
import java.util.List;

public class C10_set {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("Ömer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Başak");

        System.out.println(isimler);//[Deniz, Ömer, Esra, Hamza, Başak]

        System.out.println(isimler.get(1)); // Ömer
        //System.out.println(isimler.get(8));

        isimler.add(3,"Azim");

        System.out.println(isimler);//[Deniz, Ömer, Esra, Azim, Hamza, Başak]


       // set() ' u bir elementi UPDATE (yeni değer atamak) için kullanılır

        isimler.set(3,"Gülnur");// 3. indexteki azim i silip yerine yazdı
        System.out.println(isimler);

        System.out.println(isimler.set(2, "Yusuf"));// Esra   // esra yı sileceğini söylüyor

        System.out.println(isimler);//[Deniz, Ömer, Yusuf, Gülnur, Hamza, Başak]
    }
}
