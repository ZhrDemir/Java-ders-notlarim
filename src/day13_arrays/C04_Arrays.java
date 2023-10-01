package day13_arrays;

public class C04_Arrays {
    public static void main(String[] args) {

        // verilen String bir Array de
        // istenen harfi içeren elementleri yazdırın.

        String [] isimler = {"Hüseyin","Mehmet","Esra","Ercan","Ömer"};
        String istenenHarf = "ü";

        for (int i = 0; i < isimler.length ; i++) {

            if (isimler[i].contains(istenenHarf)) {
            System.out.print(isimler[i] + " ");
            }
        }
    }
}
