package day05_nextedIfElse_ternarySwich;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {

        // poz tam sayı al
        // çift veya tek yazdır

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen tam sayı gir");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("sayı çift");
        } else {
            System.out.println("sayı tek");
        }
// ternary ile çözümü

        System.out.println(sayi % 2 == 0 ? "sayı çift" : "sayı tek");


        // sayı 100 den büyükse sayıyı 2 katına çıkarın,
        // 100 den büyük değilse değerini 10 artırın

        sayi = sayi > 100 ? 2 * sayi : sayi + 10;

        System.out.println("ternary den sonra" + sayi);

   // sayının yeni hali 100 den  büyükse "sayı zaten büyük" yazdırın
        // yeni hali 100 den büyük değilse 2 katına çıkarın

        System.out.println(sayi>100 ? "sayı zaten büyük" : 2*sayi);
// sadece yazdıra veya sadece atama olursa ternary olur

    }

}
