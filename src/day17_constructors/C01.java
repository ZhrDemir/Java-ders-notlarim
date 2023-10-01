package day17_constructors;

import java.util.Random;

public class C01 {

    int sayi = 6;
    String str = "Java candır";

    public void rastgeleSayiUret(){

        Random random = new Random();
        int rastgeleSayi = random.nextInt(1000);
        System.out.println("Bugünkü şanslı sayi : " + rastgeleSayi);



    }

    public void bugunNePisireyim(){

        String[] yemekler = {"kuru fasulye","pilav","cacık","makarna","köfte","tavuk","sebze"};

        Random random= new Random();
        int yemekNo = random.nextInt(yemekler.length);
        System.out.println("Bugünün yemek teklifi : " + yemekler[yemekNo]);
    }

}
