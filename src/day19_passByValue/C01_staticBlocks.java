package day19_passByValue;

public class C01_staticBlocks {
    C01_staticBlocks(){
        System.out.println("constructor çalıştı");
    }

    static  {
        System.out.println("static blok çalıştı");
    }
// eğer class çalışmaya başlamadan belirli ayarlar yapmak isterseniz
// static blok oluşturabilirsiniz
//

    {
        System.out.println("statik olmayan blok");
    }
     // static olmayan block da yapabilirsiniz
    // ama method da önce çalışır block

    // yani önce statik block lar sonra static olmayan blocklar
    // sonra method


    public static void main(String[] args) {
        System.out.println("main method çalıştı");
        C01_staticBlocks obj = new C01_staticBlocks();

    }
    static {
        System.out.println("alttaki static blok çalıştı");
    }
}
// static blok çalıştı
//alttaki static blok çalıştı
//main method çalıştı
//statik olmayan blok
//constructor çalıştı