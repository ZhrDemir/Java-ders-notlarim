package day13_arrays;

public class C06_Arrays_soru4 {
    public static void main(String[] args) {

        // Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere kullanildigini yazdiran bir method olusturun.

    int [] arr = {3,4,2,6,5,4,5,7,8,2,3,9};
    int arananSayi = 3 ;

    elemanSayisiYazdir(arr,3);
    elemanSayisiYazdir(arr,11);







    }
public static void elemanSayisiYazdir(int [] arr, int arananSayi){

        int sayac = 0 ;
    for (int i = 0; i < arr.length ; i++) {
        if (arr[i] == arananSayi) {
            sayac ++ ;

        }
    }
        if (sayac == 0){
            System.out.println(arananSayi + " Aranan elemanı, array'de yok.");

        }else {
            System.out.println( arananSayi + " Aranan elemanı, array'de "+ sayac + " kere kullanılmış.");
        }

}
}
