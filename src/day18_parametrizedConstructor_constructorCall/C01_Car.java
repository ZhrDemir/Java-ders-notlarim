package day18_parametrizedConstructor_constructorCall;

public class C01_Car {

    String marka = "Marka atanmamis";
    String model= "Model atanmamis";
    String renk = "Renk atanmamis";
    int yil = 1900;
    int fiyat;

    public C01_Car(){ // hata vermesin diye parametresiz bir constroctur açtık
        // renk = "Kırmızı";  // özellik belirtilmediği müddetçe her araba kırmızı olsun demek

        /* default con. ile parametresiz cons fark
        default con ın bady si boş iken
        parametresiz cons lara kod yazılabilir
        bu durumda yapılan atamalar tüm araçlar için geçerlidir
         */
    }

    public C01_Car(String mrk , String mdl , String rnk){

        marka = mrk;
        model = mdl;
        renk = rnk;


    }

    C01_Car(String marka,String model, String renk , int fiyat){
       this.marka = marka ;
       this.model = model ;
       this.renk = renk;
       this.fiyat = fiyat ;

    }

    // tüm instance lar için parametre alan bir cons oluşturalım






    public String toString() {
        return " Ozellikler ==>" +
                "marka :'" + marka + '\'' +
                ", model :'" + model + '\'' +
                ", renk :'" + renk + '\'' +
                ", yil :" + yil +
                ", fiyat :" + fiyat ;
    }

}








































































































































