package day07_StringManipulations;

import java.util.Scanner;

public class C01_EndsWith {
    public static void main(String[] args) {
        // kullanıcıdan bir mail adresi alın.
        // mail @ içermiyorsa "geçersiz mail"
        // mail@gmail.com iermiyorsa, "mail gmail olmalı"
        // bitmiyorsa "mailde yazım hatası var"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen mail adresi gir");
        String mail = scanner.nextLine();

        if (!mail.contains("@")) {
            System.out.println("geçersiz mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmalı");}
          else if (!mail.endsWith("@gmail.com")){
            System.out.println("mailde yazım hatası var");
        }
    }
}
