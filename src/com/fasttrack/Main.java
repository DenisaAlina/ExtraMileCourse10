package com.fasttrack;


import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(8);
        integerList.add(9);
        integerList.add(5);
        integerList.add(11);
        integerList.add(5);
        integerList.add(4);
        integerList.add(7);
        integerList.add(8);
        integerList.add(8);
        integerList.add(20);
        integerList.add(3);
        integerList.add(-1);
        SortedSet1 sortedSet1 = new SortedSet1(integerList);
        System.out.println(sortedSet1);
        sortedSet1.add(4);
        sortedSet1.add(6);
        System.out.println(sortedSet1);
        System.out.println(sortedSet1.get(3));
        System.out.println(sortedSet1.get(-1));
        sortedSet1.remove(1);
        sortedSet1.remove(20);
        System.out.println(sortedSet1);

    }

}
