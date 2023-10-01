package day14_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C02_elemanEklemeFarklıYontem {
    public static void main(String[] args) {

                /*Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
eski array’e yeni degeri atayin
.
         */

        int[]arr={5,7,8,6,1,2,-2};
        System.out.println(Arrays.toString(dondur(arr)));

    }

    public static int[] dondur(int[] arr) {
        int[]arr2= new int[arr.length+1];
        for (int i = 0; i <arr.length; i++) {
            arr2[i]= arr[i];

        }
        Scanner scan =new Scanner(System.in);
        System.out.println("sayı yaz");
        arr2[arr.length]=scan.nextInt();
        return arr2;
    }
}

