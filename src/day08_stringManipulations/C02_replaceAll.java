package day08_stringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {

        String str = "J1a5v8a +/can87dir_";

        // metindeki sayı ve karakterden temizle

        // tüm sayıları yok edelim

        str = str.replaceAll("\\d", "");

        // space i korumak için space yerine bir rakam atayalım

        str = str.replaceAll("\\s", "5");

        //ö<el karakterleri yok edelim
        str = str.replaceAll("\\W", "");

        // W rakam harf _ değiştirmez
        // _ yi hiçlile yer değiştiririz

        str = str.replaceAll("_","");
        // space yerine yazdığımız sayıyı,yeniden space yapalım

        str = str.replaceAll("5"," ");
        System.out.println(str);

// bütün a ları yok et
        System.out.println(str.replace("a",""));
        System.out.println(str.replaceAll("a",""));

        // bütün harfleri * yap

        System.out.println(str.replaceAll("\\w","*"));





    }
}
