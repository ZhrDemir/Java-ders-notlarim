package day16_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C05_ListedenElemanSilme {
    public static void main(String[] args) {
        //Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan kismini list olarak bize donduren bir method olusturun
/* listenin elemanlarını index ile kontrol edip silmemiz isteniyorsa,
silme işlemi yaptığımızın ardından bir element çıkarılacağı için
index bi elemanı atlar.

Bunu engellemek için
- silme yapınca i bir azaltılabilir
- verilen listeyi geçici bir listeye aktarılıp o listeden devam edilir
 */
        List<String> isimler = new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("Ömer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Başak");
        isimler.add("Mehmet");

        String silinecekHarf = "a";
        System.out.println(istenmeyenleriSil(isimler,silinecekHarf));

    }

    public static List<String>  istenmeyenleriSil(List<String> isimler,String silinecekHarf){


        List<String> silinmeyeceklerListesi = new ArrayList<>();

        for (int i = 0; i < isimler.size(); i++) {

           /* if (isimler.get(i).toUpperCase().contains(silinecekHarf.toUpperCase())){

                isimler.remove(isimler.get(i));
               i--;
            }*/

            if (!isimler.get(i).toUpperCase().contains(silinecekHarf.toUpperCase())){
                silinmeyeceklerListesi.add(isimler.get(i));
            }
        }
        return silinmeyeceklerListesi;
    }
}
