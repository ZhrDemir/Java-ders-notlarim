package day16_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("Ömer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Başak");
        isimler.add("Esra");
        System.out.println(isimler);//[Deniz, Ömer, Esra, Hamza, Başak, Esra]

        System.out.println(isimler.indexOf("Esra"));//2  baştan 2. index tekini buldu
        System.out.println(isimler.lastIndexOf("Esra"));// 5    sondan index

        System.out.println(isimler.indexOf("ali"));// -1
        System.out.println(isimler.lastIndexOf("Azim"));// -1

    }
}
