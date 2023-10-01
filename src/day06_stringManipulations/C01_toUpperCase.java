package day06_stringManipulations;

import java.util.Locale;

public class C01_toUpperCase {
    public static void main(String[] args) {

        String str = "Java Candir";
        System.out.println(str.toUpperCase());
        System.out.println(str);

        str = str.toUpperCase();
        System.out.println(str);

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase(Locale.forLanguageTag("TR")));
        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR")));
    }
}
