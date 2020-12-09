package com.wangyichao.algorithms.sort;

import com.wangyichao.algorithms.utils.SortingHelper;

public class InsertionSort {

    /**
     * 通过交换位置实现插入排序
     *
     * @param data
     * @param <E>
     */
    public static <E extends Comparable<E>> void sort(E[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j > 0; j--) {
                if (data[j].compareTo(data[j - 1]) < 0) {
                    SortingHelper.swap(data, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    /**
     * 通过移动数据实现插入排序。
     * 因为jvm的优化，移动数据会比交换数据处理时间变短。
     * 但是，本质上，也仅仅是时间复杂度上的常数优化，但是实际时间复杂度仍未 O(n²)
     *
     * @param data
     * @param <E>
     */
    public static <E extends Comparable<E>> void sort2(E[] data) {

        for (int i = 0; i < data.length; i++) {
            E tmpNum = data[i];

            for (int j = i; j > 0; j--) {
                if (tmpNum.compareTo(data[j - 1]) < 0) {
                    data[j] = data[j - 1];
                } else {
                    data[j] = tmpNum;
                    break;
                }
            }
        }
    }

    public static <E extends Comparable<E>> void sort3(E[] data) {

        for (int i = data.length - 1; i >= 0; i--) {

            E tmpNum = data[i];

            for (int j = i; j < data.length - 1; j++) {
                if (tmpNum.compareTo(data[j + 1]) > 0) {
                    data[j] = data[j + 1];
                } else {
                    data[j] = tmpNum;
                    break;
                }
            }

        }
    }
}
