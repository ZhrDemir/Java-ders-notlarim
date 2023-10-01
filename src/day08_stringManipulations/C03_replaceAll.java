package day08_stringManipulations;

public class C03_replaceAll {
    public static void main(String[] args) {

        String str = "Arma sonucunda 1434 kelimeye ulaşıldı";

        //arama sonuçlarının 100 den fazla olduğunu test edin
        //100 den fazla ise "Test Passed",
        //100 den fazla değilse "Test Failed" yazdırın

        str=str.replaceAll("\\D","");

        System.out.println(str);

        int sonucsayısı = Integer.parseInt(str);

        if (sonucsayısı > 100) {
            System.out.println("Test Passed");}
        else {
            System.out.println("Test Failed");}


    }
}
