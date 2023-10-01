package day15_MultiDimansionalArray;

import java.util.ArrayList;
import java.util.List;

public class C08_KisaYoldanListeOlusturma {
    public static void main(String[] args) {

        int [] arr = {1,3,2,4,4,6,7,8,9,4,3,2};

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar);
    }
}
