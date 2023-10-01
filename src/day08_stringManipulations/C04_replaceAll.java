package day08_stringManipulations;

import java.util.Scanner;

public class C04_replaceAll {
    public static void main(String[] args) {

        // kullanıcıdan isim soyisim ve kart numarasını alıp
        // asağıdaki şekilde yazdırsın
        // Isim soyisim  : S*****  G****
        //Kart No   : 1234 **** **** ****

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isim girin");
        String isim = scanner.next();

        System.out.println("Lütfen soyisim girin");
        String soyisim = scanner.next();

        System.out.println("Kart numaranızı girin");
        String kartNo = scanner.next();

       String yildizliIsim = isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*" );

       String yildizliSoyisim = soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w","*");



                   }
}
