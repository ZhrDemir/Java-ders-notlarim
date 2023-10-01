package day02_scanner_DataCasting;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        // Soru 1

// adım 1


        Scanner scanner = new Scanner(System.in);

// adım 2      kullanıcıya ne istediğinizi söyleyin


        System.out.println("Lütfen isminizi girin");
  // adım 3

        String girilenİsim= scanner.nextLine();
        System.out.println("Girdiğiniz isim : " + girilenİsim);


 // ikinci olarak bir tamsayı isteyelim mesela yaşı

        System.out.println("Lütfen yaşınızı girin");

        int yas = scanner.nextInt();

        System.out.println("Yaşınız : " + yas);


        // emekli mi true / false

        System.out.println("Emekli misiniz?  true veya false olarak giriniz");

        boolean emekliMi = scanner.nextBoolean();


        System.out.println("Emekli mi? " + emekliMi );





    }
}
