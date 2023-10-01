package day03_WrapperClass_Matematik;

import java.util.Scanner;

public class C03_Sayınınrakamlartoplamınıbulma {
    public static void main(String[] args) {
        // kullanıcıdan 3 bas poz tam sayı alıp sayının rak top yazınız

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen üç bas poz tam sayı girin:");

        int girilensayi = scanner.nextInt();

        int rakamlarToplamı = 0;
        int rakam = 0;

        rakam = girilensayi % 10 ;
        rakamlarToplamı = rakamlarToplamı + rakam ;
        girilensayi = girilensayi / 10;
        // girilensayı 25 oldu rakam 7 rak top 7


        rakam = girilensayi % 10 ;
        rakamlarToplamı = rakamlarToplamı + rakam ;
        girilensayi = girilensayi / 10 ;
        // girilensayı 2 oldu rakam 5 rak top 12


        rakam = girilensayi % 10 ; // 2 % 10  2
        rakamlarToplamı = rakamlarToplamı + rakam ;// 12 + 2 =14
        girilensayi = girilensayi / 10 ; //  2/ 10 = 0 sonuç 0 oluncaya kadar devam et dicez


        System.out.println("girilen sayının rakamlar toplamı = " + rakamlarToplamı);




    }
}
