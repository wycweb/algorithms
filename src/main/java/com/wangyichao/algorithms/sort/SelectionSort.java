package com.wangyichao.algorithms.sort;

import com.wangyichao.algorithms.utils.SortingHelper;

public class SelectionSort {

    public static <E extends Comparable<E>> void sort(E[] data) {

        for (int i = 0; i < data.length; i++) {
            // 最小值的索引
            int minIndex = i;

            for (int j = i; j < data.length; j++) {
                if (data[j].compareTo(data[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            SortingHelper.swap(data, i, minIndex);
        }

    }


    public static <E extends Comparable<E>> void sort2(E[] data) {

        for (int i = data.length - 1; i >= 0; i--) {
            int maxIndex = i;

            for (int j = i; j >= 0; j--) {
                if (data[j].compareTo(data[maxIndex]) > 0) {
                    maxIndex = j;
                }
            }

            SortingHelper.swap(data, i, maxIndex);
        }
    }

}
