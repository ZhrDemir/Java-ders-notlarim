package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C01_FaktoriyelHesaplama {
    public static void main(String[] args) {
        // soru5: 20 nin altında bi sayı isteyin
        // faktoriyeli hesaplayın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen 20 den küçük poz sayı girin");
        int sayi = scanner.nextInt();

        long faktoriyelSonucu = 1;

        System.out.print(sayi + "!= ");

        for (int i = sayi; i >= 1; i--) {
            faktoriyelSonucu *= i;
            if (i != 1) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i + " = ");
            }

    }
        System.out.print(faktoriyelSonucu);
}
}
