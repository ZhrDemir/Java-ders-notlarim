package day04_ifStatement;

import java.util.Scanner;

public class C09_IfElseSt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen kg olarak kilonuzu girin");
        double kilo = scanner.nextDouble();

        System.out.println("Lütfen cm olarak boyunuzu girin");
        double boy = scanner.nextDouble();

        double vke = (kilo*10000 / (boy * boy));
        System.out.println("Vücut kitle endeksi : " + vke);

        if (kilo<20 || kilo > 200 || boy < 20 || boy > 200 || vke < 10 || vke >50){
            System.out.println("girdiğiniz bilgileri düzeltin");
        }else if (vke > 30){
            System.out.println("vücut kitle indeksiniz :" + vke + "sonuç : obez ");
        }else {
            System.out.println("vki : " + vke + " sonuç: kilolusunuz");
        }
    }
}


