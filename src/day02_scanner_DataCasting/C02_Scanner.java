package day02_scanner_DataCasting;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        // soru 4
        // kullanıcıdan dikdörtgenin kenarlarını iste alan bul


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen dikdörtgenin kenar uzunluklarını girin ");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();

        System.out.println("Dikdörtgenin Alanı : " + kenar1*kenar2);

    }
}
