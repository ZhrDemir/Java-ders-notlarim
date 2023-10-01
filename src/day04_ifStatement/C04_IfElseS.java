package day04_ifStatement;

import java.util.Scanner;

public class C04_IfElseS {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunlukları giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1==kenar2  && kenar1==kenar3 && kenar1>0){
            System.out.println("eşkenar üçgen");
        } else {System.out.println(" eşkenar değil");
        }
    }
}
