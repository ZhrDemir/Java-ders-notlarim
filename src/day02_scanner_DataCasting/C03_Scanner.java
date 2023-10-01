package day02_scanner_DataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        // soru 5

        Scanner scanner = new Scanner(System.in);

        System.out.println("LÜTFEN isminizi Giriniz ");

        char ilkHarf = scanner.nextLine().charAt(0);
        System.out.println("Lütfen soy isminizi giriniz ");

        String soyİsim = scanner.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");

        int yas = scanner.nextInt();

        System.out.println("Girilen bilgiler : " + ilkHarf + " " + soyİsim+ " " +yas);

    }
}
