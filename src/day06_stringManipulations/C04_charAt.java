package day06_stringManipulations;

public class C04_charAt {
    public static void main(String[] args) {
        String str = "Java gün geçtikçe güzelleşiyor.";

        // ilk harfi yazdırın
        System.out.println(str.charAt(0)); // J
        System.out.println(str.charAt(4)); // space

        // str da 31 karakter var
        // son karakter olan . nın indeksi 30 olur
        // son karakter yazdırın
        System.out.println(str.charAt(31-1)); //  .
        // sondan 5. karakter
        System.out.println(str.charAt(31-5)); // i

        // str da olmayan bir index i stersek
        // sout (str.charAt(44) ; // hata verir

    }
}
