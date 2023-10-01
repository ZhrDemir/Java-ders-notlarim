package day02_scanner_DataCasting;

import java.util.Scanner;

public class C06_asciiT {
    public static void main(String[] args) {


        char chr1= 'a';
        int sayi1 = chr1 ;
        System.out.println("a nın int karşılığı : " + sayi1);


        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen asciitable den bir karakter giriniz.");

        char krk = scanner.next().charAt(0);


    }
}
