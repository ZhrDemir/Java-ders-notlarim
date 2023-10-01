package day02_scanner_DataCasting;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {


        // Soru7
      //  kullanıcıdan iki değer alıp değiştir

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen ilk tam sayıyı giriniz ");
        int sayi1 = scanner.nextInt();

        System.out.println("Lütfen ikinci sayıyı giriniz ");

        int sayi2 = scanner.nextInt();

        System.out.println("Girdiğiniz değerler : sayı 1 = "+ sayi1+ ", sayı 2 = "+ sayi2);

        int boşKova = 0;
        boşKova = sayi2;
        sayi2 = sayi1;
        sayi1 = boşKova;




        System.out.println("Değişen değerler : sayı 1 = "+ sayi1 + ", sayı 2 = " + sayi2);




    }
}
