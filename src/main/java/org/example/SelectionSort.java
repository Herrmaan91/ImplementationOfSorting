package org.example;

import java.util.LinkedList;
import java.util.List;

public class SelectionSort {

    void sort(List<Integer> list) {
        int localMin;
        int indexOfLocalMin = 0;
        for (int j = 0; j < list.size() - 2; j++) {
            localMin = list.get(j);
            for (int i = j; i < list.size(); i++) {
                    if (list.get(i) < localMin) {
                        localMin = list.get(i);
                        indexOfLocalMin = i;
                    }
            }
            int temporaryInt = list.get(j);
            list.set(j, localMin);
            list.set(indexOfLocalMin, temporaryInt);
        }
    }

}

class SortingDemo {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        List<Integer> listka = new LinkedList<>(List.of(20, 10, 15, 1, -5, 40, 88, -250, 90, -5000, 0, 15));
        System.out.println(listka);
        selectionSort.sort(listka);
        System.out.println(listka);
    }
}

