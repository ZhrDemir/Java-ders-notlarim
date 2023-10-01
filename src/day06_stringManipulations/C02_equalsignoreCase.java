package day06_stringManipulations;

import java.util.Scanner;

public class C02_equalsignoreCase {
    public static void main(String[] args) {

        //kullanıcıdan bir harf isteyin
        // kullanıcı a yazarsa "Aile"
        // i yazarsa "Iş"
        // bu harflerin dışında karakter girerse
        // "bu harfi bilmiyorum" yaz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz.");
        char girilenHarf = scanner.next().charAt(0);

        // kullanıcı küçük veya büyük harf girmiş olabilir
        // Stringleri büyük küçük harf gözetmeksizin karşılaştırabiliriz
        //
        String harf = girilenHarf + "";

        if (harf.equalsIgnoreCase("a")) {
            System.out.println("Aile");
        } else if (harf.equalsIgnoreCase("i")) {
            System.out.println("İş");


        } else {
            System.out.println("Bu harfi bilmiyorum.");}
    }
}
