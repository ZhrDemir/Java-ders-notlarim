package day03_WrapperClass_Matematik;

public class C01_WrapperClass {
    public static void main(String[] args) {
        int sayi =20;
        String str = "Java";

        Integer sayi2 =30;
        sayi = sayi2;
        sayi2 = sayi;


        char chr1 = 'j';
        Character chr2 = chr1;


        System.out.println(Short.MIN_VALUE);

        String str1 = "34";
        String str2 = "23";

        System.out.println(str1 + str2);
        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));


        chr1 = 'a';
        System.out.println(Character.isDigit(chr1));
        System.out.println(Character.isLetter(chr1));
        System.out.println(Character.toUpperCase(chr1));


        String metin = 23 + "a";
        System.out.println(metin);
        String metin1 = 23 + "";
        System.out.println(metin1);

    }
}
