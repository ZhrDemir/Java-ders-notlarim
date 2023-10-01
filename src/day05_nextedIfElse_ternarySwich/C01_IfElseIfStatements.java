package day05_nextedIfElse_ternarySwich;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {

        //SORU1: CİNSİYETİNİ VE YASINI AL
        // EMEKLİ 60 YAS ÜZERİ KADIN,ERKEK 65 YAS ÜZERİ

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen cinsiyeti girin E: erkek K: Kadın");
        char cns = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yasınızı girin: ");
        double yas = scanner.nextDouble();
;
        if (yas <20 || yas > 80 ||  !( cns == 'E' || cns == 'K')){
            System.out.println("Girilen bilgilerde hata var");}
    else   if (cns == 'E' && yas >=65) {
            System.out.println("Erkek emekli olabilir");
        } else if  (cns == 'E') {
            System.out.println("erkek emekli olmak için daha " + (65 - yas)+ "yıl çalışmalıdır.");
        } else if (cns == 'K' && yas >= 60) {
            System.out.println("Kadın emekli olabilir");
        } else {
            System.out.println("kadın emekli olmak için daha " + (60 - yas) + "yıl çalışmalıdır.");
        }
    }






    }


