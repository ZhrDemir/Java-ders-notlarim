package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C10_NestedForLoops {


    public static void main(String[] args) {
         // kullanıcıdan satır iste
      // *
      //  * *
      //  * * *
      //  * * * *
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen satır sayısı girin");
        int satir = scanner.nextInt();

        for (int i = 1; i <= satir; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }

        }



    }
