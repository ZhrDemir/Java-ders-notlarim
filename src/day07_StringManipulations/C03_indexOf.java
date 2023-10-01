package day07_StringManipulations;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class C03_indexOf {
    public static void main(String[] args) {

        // verilen bir cümlede
        //aranan bi metin için aşağıdaki cümlelerden uygun olanı yazdıracak bi prog yazdır
        // - cümle aranan metin içermiyor
        // - cümlede aranan metin sadece 1 kere kullanılmış
        // - cümlede aranan metin sadece 2 kere kullanılmış
        // - cümlede aranan metin sadece 3 kere kullanılmış

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle = scanner.nextLine();

        System.out.println("lütfen aranan metni giriniz");
        String metin = scanner.nextLine();

        int ilkIndex = 0;
        int ikinciIndex = 0;
        int ucuncuIndex = 0;

        ilkIndex = cumle.indexOf(metin); // -1 veya kullanılan index

        if ( ilkIndex == -1){
            System.out.println("cümle aranan metni içermiyor");}
        else if ((ikinciIndex = cumle.indexOf(metin,ilkIndex +1)) == -1 ) {  // mutlaka kullanılmış ama kaç defa
            System.out.println("cümlede aranan metin sadece 1 kere kullanılmış ");}
        // ilk index -1 değil, ikinci index -1 değil
        // şimdiki sorumuz sadece 2 tane mi var yoksa 2 den fazla mı

        else {  ucuncuIndex = cumle.indexOf(metin,ikinciIndex+1);
            // ucüncü  index -1 olabilir veya olan bi index
            if (ucuncuIndex == -1) {
                System.out.println("cümlede aranan metin sadece 2 kere kullanılmış");}
            else {
                System.out.println("cümlede aranan metin ikiden fazla kullanılmış");}
            }

    }
}
