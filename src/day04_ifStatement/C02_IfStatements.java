package day04_ifStatement;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {

        // soru 4- Kullanıcıdan üçgenin 3 kenar uzunluğunu alın,
        //         üçgen eşkenar ise eşkenar üçgen yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz ");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 ==kenar2  && kenar2==kenar3 && kenar1>0){
            System.out.println("Verilen kenar uzunlukları eş kenar üçgen oluşturur20");
        }
    }
}
