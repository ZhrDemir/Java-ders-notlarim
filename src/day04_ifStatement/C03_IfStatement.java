package day04_ifStatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {

        // Soru 5- Kullanıcıdan notunu alın 50 veya daha büyükse sınıfı geçtin , 50 den küçükse maalesef kaldın yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu girin");

        double not = scanner.nextDouble();

        if (not >= 50) {
            System.out.println("sınıfı geçtin");
        }
        if (not < 50) {
            System.out.println("maalesef kaldınız");
        }
    }
}
