package day15_MultiDimansionalArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydekiTekrarEdenleriSilme {
    public static void main(String[] args) {

         // verilen bir int array'de
        // tekrar eden elementleri silip
        // arrayi her elementin unique olduğu bir hale getirin

        int [] arr = {1,3,2,4,4,6,7,8,9,4,3,2};

         // bir list oluşturalım
        List<Integer> uniqueList = new ArrayList<>();

        // arrayin tüm elemanlarını tek tek ele alalım
        // liste de olup olmadığını bakalım,listede yoksa ekleyelim

        for (int i = 0; i < arr.length ; i++) {
            if (!uniqueList.contains(arr[i])){
                uniqueList.add(arr[i]);

            }
        }
        System.out.println("Unique list : " + uniqueList);// Unique list : [1, 3, 2, 4, 6, 7, 8, 9]

        // yeni bir array oluşturalım

        int[] yeniArr = new int[uniqueList.size()];
        System.out.println(Arrays.toString(yeniArr)); // [0, 0, 0, 0, 0, 0, 0, 0]

        //listedeki elementleri yeni arraye atayalım
        for (int i = 0; i < yeniArr.length; i++) {
            yeniArr[i] = uniqueList.get(i);
        }

        // yeni arrayi de eski arraye değer olarak atayalım
        arr = yeniArr;

        System.out.println("Array'in son hali : " + Arrays.toString(arr));
          Arrays.sort(arr);
        System.out.println("düzenli hali : " + Arrays.toString(arr));


    }
}
