package com.wycweb.algorithms;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {10, 9, 11, 7, 6, 5, 4, 3, 2, 1, 9};

        SelectionSort.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void sort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            // 寻找[i, n)区间里的最小值的索引
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }

            swap(arr, i, minIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int m = arr[i];
        int n = arr[j];

        arr[i] = n;
        arr[j] = m;
    }
}
