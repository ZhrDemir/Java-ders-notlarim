package day04_ifStatement;

public class C01_BağımsızIfCümleleri {
    public static void main(String[] args) {

        int a = 25;
        int b = 40;

        if (a > b) {
            System.out.println("a b den büyük");
        }
        // a çift sayı mı

        if (a % 2 == 0) {
            System.out.println("a çift sayı mı");
        }

        // b 5 ile tam bölünüyor mu

        if (b % 5 == 0) {
            System.out.println("b 5 ile tam bölünür");
        }

        // a üç bas mı

        if (a >= 100 && a < 1000) {
            System.out.println("a üç basamaklı");
        }

        // a ile b nin toplamı 100 den büyük mü

        boolean sart = a + b > 100;
        System.out.println(sart); // false

        if (sart) {
            System.out.println("a ile b nin toplamı 100 den büyük");
        }

        if (true) {
            System.out.println("Bu if badysi her zaman çalışır");
        }



    }
}