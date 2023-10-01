package day13_arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {



                // verilen int bir array'deki
                // tum elementlerin degerlerini 2 artirin
                int[] arr = {3,5,7,10,2,6};
                System.out.println("Array'in ilk hali : " + Arrays.toString(arr));
                for (int i = 0; i < arr.length ; i++) {
                    arr[i] += 2 ;
                }
                System.out.println("Array'in son hali : " + Arrays.toString(arr));
        System.out.println("************");


                int [] liste = {10,20,30,40};
        System.out.println("İlk değerler : " + Arrays.toString(liste));
        System.out.print("Array'ın tersi:");
        for (int i = liste.length-1; i >=0; i--) {

            System.out.print(liste[i]+" ");
        }
       // System.out.println(Arrays.toString(liste1));


            }
        }






