package day06_stringManipulations;

public class C08_startsWith_endWith {
    public static void main(String[] args) {


        String str = "Java candir.";

        System.out.println(str.contains("a"));
        System.out.println(str.startsWith("a"));
        System.out.println(str.endsWith("a"));

        System.out.println(str.endsWith("candir"));
        System.out.println(str.startsWith(""));
        System.out.println(str.endsWith(""));
        System.out.println(str.startsWith("java"));
    }
}
