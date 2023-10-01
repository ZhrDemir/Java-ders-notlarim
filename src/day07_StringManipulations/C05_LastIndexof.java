package day07_StringManipulations;

import java.util.Scanner;

public class C05_LastIndexof {
    public static void main(String[] args) {
        // verilen bir cümlede
        //aranan bi metin için aşağıdaki cümlelerden uygun olanı yazdıracak bi prog yazdır
        // - cümle aranan metin içermiyor
        // - cümlede aranan metin sadece 1 kere kullanılmış
        // - cümlede aranan metin 1 den fazla kullanılılmış

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir cümle gir");
        String cumle =scanner.nextLine();

        System.out.println("lütfen aranan metni gir");
        String  metin = scanner.nextLine();
         int ilkindex = cumle.indexOf(metin); // -1 veya index
        int sonindex = cumle.lastIndexOf(metin); // -1 veya index

        if (ilkindex == -1){
            System.out.println("cümle aranan metin içermiyor. ");}
        else if (ilkindex == sonindex) {
            System.out.println("cümlede aranan metin sadece 1 kere kullanılmış");
        } else {
            System.out.println("cümlede aranan metin 1 den fazla kullanılmış" );}


        }

    }

