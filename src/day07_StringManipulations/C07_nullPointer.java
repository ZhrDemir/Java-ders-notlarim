package day07_StringManipulations;

public class C07_nullPointer {
    public static void main(String[] args) {


 String str;
 String str2 = "" ;
        System.out.println(str2);//hiçlik yazdırır

        // str2 yi kullanabilmek için hiçlik değeri atayabiliriz
        // ancak hiçlik değeri atanan veriableları
        // Java değer atanmamış olarak sınıflandırmaz
        // değer atananlar grubuna kayar


        /* java değer atanmamış variableları işaretlemek için özel olarak null keyword unu oluşturmuştur

         */
          /* String str3 = true;
          String str3 = 45 ;
          String str3 = 'f';
          kabul etmez
           */
        String str3 = null ; // null olarak işaretlenmiştir
        String str4 = ""; // hiçlik değeri atanmıştır
        String str5 = "Tava"; // tava değeri atanmıştır

        System.out.println(str3);
        /*  ********null değer değil İŞARETÇİDİR
        str3 ün oluşturulduğunu ve bir değer atanmadan kullanılmak istendiğini gösterir.
         yazdırabilirsiniz ama methodlarda kullanamazsınız*******
         */

       // str3 = "esra"; // sonradan atama yapabiliriz

       // System.out.println(str.isBlank());
        //System.out.println(str.substring(0,1));
        // System.out.println(str3.isEmpty());
        // System.out.println(str3.charAt(0));


        System.out.println(str3==null);// true


    }
}
