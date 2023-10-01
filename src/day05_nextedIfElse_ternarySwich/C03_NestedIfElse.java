package day05_nextedIfElse_ternarySwich;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen aldığınız ürün adedi giriniz");
        int urunAdedi = scanner.nextInt();

        System.out.println("Lütfen ürün fiyatı giriniz");
        double fiyati = scanner.nextDouble();

        System.out.println("Müşteri kartınız var mı ? \nE: evet H : hayır");
        char kart = scanner.next().toUpperCase().charAt(0);


        // kartın olup olmaması ana değişken olsun

        if (kart == 'E') {
            if (urunAdedi >= 10) {
                System.out.println("%20 indirimli toplam fiyatı: " + urunAdedi * fiyati * 80 / 100);

            } else System.out.println("%15 indirimli toplam fiyatı: " + urunAdedi * fiyati * 85 / 100);

        } else if (kart == 'H') {
            if (urunAdedi >= 10) {
                System.out.println("%15 indirimli toplam fiyatı: " + urunAdedi * fiyati * 85 / 100);

            } else System.out.println("%10 indirimli toplam fiyatı: " + urunAdedi * fiyati * 90 / 100);
        } else {
            System.out.println("Kart bilgisini doğru giriniz.");
        }


    }
}
