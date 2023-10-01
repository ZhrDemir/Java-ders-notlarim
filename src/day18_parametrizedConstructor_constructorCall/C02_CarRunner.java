package day18_parametrizedConstructor_constructorCall;

public class C02_CarRunner {
    public static void main(String[] args) {


        C01_Car car1 = new C01_Car();

        System.out.println("Car1 " + car1); // Car1  Ozellikler ==>marka :'Marka atanmamis',
                                                          // model :'Model atanmamis', renk :'Renk atanmamis', yil :1900, fiyat :0
        car1.marka = "BMW";
        car1.model = "116";
        car1.yil = 2010;
        car1.fiyat = 7500;
        System.out.println("Car1 "+car1); // Car1  Ozellikler ==>marka :'BMW',
                                                       // model :'116', renk :'Renk atanmamis', yil :2010, fiyat :7500

      // marka,model ve renk değerlerini parametre olarak yollayabileceğimiz bir constructor oluşturalım


        C01_Car car2 = new C01_Car("Nissa","Micra","Mavi");
        System.out.println("Car2 " + car2); // Car2  Ozellikler ==>marka :'Nissa', model :'Micra', renk :'Mavi', yil :1900, fiyat :0


        C01_Car car3 = new C01_Car("Opel","Corsa","Beyaz");
        System.out.println("Car3 "+ car3); // Car3  Ozellikler ==>marka :'Opel', model :'Corsa', renk :'Beyaz', yil :1900, fiyat :0


        C01_Car car4= new C01_Car("Peugeot","206","Turuncu",170000);
        System.out.println("Car4 "+ car4);// Car4  Ozellikler ==>marka :'Peugeot', model :'206', renk :'Turuncu', yil :1900, fiyat :170000

    }
}
