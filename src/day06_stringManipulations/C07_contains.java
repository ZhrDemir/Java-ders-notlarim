package day06_stringManipulations;

public class C07_contains {
    public static void main(String[] args) {

        String str = "Javaya çok çalışırsan, çok çabuk iş bulursun";

        System.out.println(str.contains("a"));
        System.out.println(str.contains("Java"));
        System.out.println(str.contains("java"));
        System.out.println(str.contains("av"));
        System.out.println(str.contains(" "));
        System.out.println(str.contains(""));
        System.out.println(str.contains("çok çalış"));
    }
}
