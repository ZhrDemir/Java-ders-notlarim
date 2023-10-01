package day03_WrapperClass_Matematik;

public class C06_Concatenation {
    public static void main(String[] args) {


        String s1= "Java";
        String s2 = "Kolaydır";
        String s3 = " ";
        String s4 = "";


        int a = 4;
        int b = 3;

        // sadece verilenleri kullanarak aşağıdakileri yazdır

        //java kolaydır 12

        System.out.println(s1+s3+s2+s3+a*b);


        // java7kolaydır

        System.out.println(s1+(a+b)+s2);

        // 43java

        System.out.println(a+s4+b+s1);

         //


    }
}
