package day06_stringManipulations;

public class C06_substring {
    public static void main(String[] args) {

        String str = "Java en güzel programlama dili";

        System.out.println(str.substring(5)); //  en güzel....

        System.out.println(str.substring(str.length()-4)); //dili

        System.out.println(str.substring(1,2));

        System.out.println(str.substring(str.length()-5));

        System.out.println(str.charAt(1));
    }
}
