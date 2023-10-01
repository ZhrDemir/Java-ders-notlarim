package day07_StringManipulations;

public class C02_ındexOf {
    public static void main(String[] args) {

        String str = "Java candır, Selenium heyecan.";
        // str selenium içeriyor mu
        System.out.println(str.contains("Selenium")); // true

        // str selenium ile mi bitiyor
        System.out.println(str.endsWith("Selenium")); // false

        // str selenium ile mi başlıyor
        System.out.println(str.startsWith("Selenium"));//false

        // selenium nerede

        System.out.println(str.indexOf("Selenium")); // selenium un kaçıncı indexte başladığını gösterir 13

        // olmayan bir metin aratalım
        System.out.println( str.indexOf("x"));  // x yok -1 yazar

        // contains metodunu kullanmadan str ın java içerip içermediğini yazdır

        if (str.indexOf("java")== -1 ) {
            System.out.println("false");
        } else System.out.println("true");

        // str daki ilk a harfinin index ini yazdır
        System.out.println(str.indexOf("a")); // 1

        // str daki ikinci a harfinin index ini yazdır

        System.out.println(str.indexOf("a",2));// 3

        // str daki 3. a harfini index ten bul yazdır
        System.out.println(str.indexOf("a",4)); // 6

        // str da 4. a varsa indexi ni yazdır
        // yoksa "str sadece 3 tane a içeriyor" yazdır

        if (str.indexOf("a",7) == -1){
            System.out.println("str da sadece 3 tane a var");}
        else System.out.println("4. a nın  index i :" + str.indexOf("a",7)); //27

        // str da 5. a varsa indexi ni yazdır
        // yoksa "str sadece 4 tane a içeriyor" yazdır

        if (str.indexOf("a",28) == -1){
            System.out.println("str da sadece 4 tane a var");}
        else System.out.println("5. a nın  index i :" + str.indexOf("a",28)); //




    }
}
