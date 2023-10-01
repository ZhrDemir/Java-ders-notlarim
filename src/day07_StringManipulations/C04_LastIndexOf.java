package day07_StringManipulations;

public class C04_LastIndexOf {
    public static void main(String[] args) {
        String str = "Jaca candır, selenium heyecan";

        // str a ile mi başlar

        System.out.println(str.startsWith("a")); // false

        // a nın ilk kullanıldığı index i yaz

        System.out.println(str.indexOf("a")); //1

        // str a ile mi biter

        System.out.println(str.endsWith("a")); // false

        // a nın son kullanımının index i yaz

        System.out.println(str.lastIndexOf("a"));
        // can kelimesinin ilk indexi

        System.out.println(str.indexOf("can")); // 5

        // can kelimesinin son kullanımın indexi yaz

        System.out.println(str.lastIndexOf("can"));//26

       // selenium kelimesinin ilk kullanım ve son kullanım indexini yazdır
        System.out.println(str.indexOf("selenium")); // 13
        System.out.println(str.lastIndexOf("selenium"));//13

    }
}
