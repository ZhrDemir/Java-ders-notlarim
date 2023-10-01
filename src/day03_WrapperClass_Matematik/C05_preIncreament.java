package day03_WrapperClass_Matematik;

public class C05_preIncreament {
    public static void main(String[] args) {

        int a=20;
        // a nın değerini yazdırın sonra a nın değerini bir artırıp oluşturacağınuz
        // b n ye ata

        System.out.println("a : " + a);
        a ++;
        int b = a ;

        System.out.println("işlem sonunda a: " + a + " ,b :  "+ b );

        // a nın değerini b ye ata
        // sonra a nın değerini 1 artırın

        a = 20;
        b = a;


         a++ ;
        System.out.println("işlem sonunda a: " +a+ " , b: ");


        a = 20 ;
        b = a++ ;
        System.out.println("a++ işlem sonunda a:" +a+ ",b:"+b);


        a= 20 ;
        b = ++a ;
        System.out.println("a++ işlem sonunda a:" +a+ ",b:"+b);


        // önce c yazdır sonra c nin değerini bir artırır
        int c = 40;
        System.out.println("c++ ile yazdırınca : "+ c++);
        System.out.println("c++ ile bir alt satırda c nin değeri : " +c);

        // önce c yi artırır sınra c yi yazdır
        c = 40;
        System.out.println("++c ile yazdırınca : "+ ++c);
        System.out.println("c++ ile bir alt satırda c nin değeri : " +c);


    }
}
