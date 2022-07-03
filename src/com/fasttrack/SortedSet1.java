package com.fasttrack;

import java.util.Collections;
import java.util.List;

public class SortedSet1 {
    private List<Integer> sortedSet1;

    public SortedSet1(List<Integer> sortedSet1) {
        Collections.sort(sortedSet1);
        for (int i = 0; i < sortedSet1.size(); i++) {
            for (int j = 0; j < sortedSet1.size(); j++) {
                if (i == j) {
                    continue;
                } else {
                    if (sortedSet1.get(i) == sortedSet1.get(j)) {
                        sortedSet1.remove(j);
                    }
                }
            }
        }
        this.sortedSet1 = sortedSet1;
    }

    public void add(int element) {
        if (sortedSet1.contains(element)) {
            System.out.println("You can't add an element that already exists in the list!");
        } else {
            sortedSet1.add(element);
            Collections.sort(sortedSet1);
        }

    }

    public int get(int index) {
        int i = -1;
        if (index < 0 || index >= sortedSet1.size()) {
            System.out.println("The index must be in the range 0- " + (sortedSet1.size() - 1));
        } else {
            i = sortedSet1.get(index);
        }
        return i;
    }

    public void remove(int index) {
        if (index < 0 || index >= sortedSet1.size()) {
            System.out.println("The index must be in the range 0- " + (sortedSet1.size() - 1));
        } else {
            sortedSet1.remove(index);
        }
    }

    @Override
    public String toString() {
        return "SortedSet1{" +
                "sortedSet1=" + sortedSet1 +
                '}';
    }
}
