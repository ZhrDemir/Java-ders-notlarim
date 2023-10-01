package day05_nextedIfElse_ternarySwich;

import java.util.Scanner;

public class C02_NestedIfElse {
    public static void main(String[] args) {

        //SORU1: CİNSİYETİNİ VE YASINI AL
        // EMEKLİ 60 YAS ÜZERİ KADIN,ERKEK 65 YAS ÜZERİ

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen cinsiyeti girin E: erkek K: Kadın");
        char cns = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yasınızı girin: ");
        double yas = scanner.nextDouble();
        ;
        if (cns == 'E') { // SADECE ERKEKLER
            if (yas < 20 || yas > 80) {
                System.out.println("hatalı");
            } else if (yas >= 65) {
                System.out.println("erkek emekli olabilir");
            } else System.out.println("erkek emekli olması için " + (65 - yas) + " yıl çalışmalıdır");

        }
        if (cns == 'K') { // SADECE kadınlar
            if (yas < 20 || yas > 80) {
                System.out.println("hatalı");
            } else if (yas >= 60) {
                System.out.println("kadın emekli olabilir");
            } else System.out.println("kadın emekli olması için " + (60 - yas) + " yıl çalışmalıdır");
        }

    }


}
