package day17_constructors;

public class C05 {


    // default constructor ile aynı işlevi yapan
    // görünür bir constructor oluşturalım.

    C05(){
        System.out.println("merhaba, ben constructor");
    }
    // bu cons görünür olduğu için
    // bu default cons değil
    // parametresiz constractor denir
    // çünkü default constractor ların body si boş olmalı
    // ama biz parametresiz constructor ların body sine sonradan değer atanabilir



    int sayi = 0;

    String str ;

    public void  method1(){
        System.out.println(sayi); // çalışıp çalışmadığı kontrol edildi
    }

    public void C05(){
        // method isimleri kucuk harfle baslamalidir
        // ama bu bir kural degil convention(genel kabul)'dir.
        // bir kod blogunun return type'i varsa method'dur
    }
    /*
    public asd(){
    }
    c05(){
    }
    Invalid method declaration; return type required
    ismi class adi ile ayni degil, olsa olsa method olabilir
    ama method icin return type yazilmali
     */
}



