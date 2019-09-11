package com.wycweb.algorithms.sort;

/**
 * 选择排序
 * 时间复杂度：O(n^2)
 * 从第一个位置开始，在整个数据集中找比第一个位置最小的元素，找到之后放在第一个位置
 * 第一个位置处理完成后，在从第二个位置开始找最小的元素，放在第一个位置
 * 以此类推
 */
public class SelectionSort {

    public static void sort(Comparable[] arr) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            int minIndex = i;

            for (int j = minIndex + 1; j < length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0 ) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    private static void swap(Object[] arr, int i, int j) {
        Object m = arr[i];
        Object n = arr[j];

        arr[i] = n;
        arr[j] = m;
    }
}


