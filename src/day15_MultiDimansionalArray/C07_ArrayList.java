package day15_MultiDimansionalArray;

import java.util.ArrayList;
import java.util.List;

public class C07_ArrayList {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        System.out.println(sayilar);//[]
        sayilar.add(5);
        sayilar.add(0,1);
        System.out.println("Liste boş mu? "+ sayilar.isEmpty());


        System.out.println(sayilar.size());
        System.out.println(sayilar.contains(5));
        System.out.println(sayilar.contains(3));

        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(8);

        System.out.println(sayilar);//1,5,3,2,8

        List<Integer> rakamlar = new ArrayList<>();
        rakamlar.add(3);
        rakamlar.add(8);
        rakamlar.add(5);

        System.out.println(sayilar.containsAll(rakamlar));// true

        rakamlar.add(9);

        System.out.println(sayilar.containsAll(rakamlar));//false
    }
}
