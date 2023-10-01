package day08_stringManipulations;

public class C01_replace {
    public static void main(String[] args) {

        String str = "Java candir";
        System.out.println(str.replace('a', 'q'));

        System.out.println(str.replace("Java", "Tava"));
        System.out.println(str.replace('x', 'y'));

        System.out.println(str.replaceFirst("\\w", "*"));

        str = "Java 44Candır";
        System.out.println(str.replaceFirst("\\d", "+"));


        System.out.println(str.replace("c", "k"));
    }
}