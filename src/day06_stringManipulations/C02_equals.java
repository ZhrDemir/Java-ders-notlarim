package day06_stringManipulations;

public class C02_equals {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";
        String str4 = new String( "Java");
        String str5 = "Ja" +"va";
        String str6 = "Ja";
        String str7 = "va";
        String str8 = str6 + str7;

        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equals(str4));//true
        System.out.println(str1==str2);
        System.out.println(str1==str4);//false
//
    }
}
