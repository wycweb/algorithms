package com.wycweb.algorithms.sort;

import com.wycweb.algorithms.common.SortTestHelper;

public class BubbleSort {

    public static void main(String[] args) {

        Integer[] arr = SortTestHelper.generateRandomArray(5, 0, 10);

        SortTestHelper.testSort("com.wycweb.algorithms.sort.PopSort", arr, true);
    }

    public static void sort(Comparable[] arr) {
        int length = arr.length;

        for (int i = length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    swap(arr, j, j + 1);
                }
            }
        }

    }


    private static void swap(Object[] arr, int i, int j) {
        Object m = arr[i];

        arr[i] = arr[j];
        arr[j] = m;
    }
}
