package com.wangyichao.algorithms.sort;

import com.wangyichao.algorithms.utils.ArrayGenerator;

/**
 * 线性查找法
 */
public class LinearSearch {

    private LinearSearch() {

    }

    public static void main(String[] args) {
        int runs = 100;

        int[] dataSize = {100000, 1000000};

        for (int n : dataSize) {
            // 生成顺序的10W长度的数组
            Integer[] data = ArrayGenerator.generateOrderedArray(n);

            long startTime = System.nanoTime();
            for (int k = 0; k < runs; k++) {
                LinearSearch.sort(data, 10000);
            }
            long endTime = System.nanoTime();
            double time = (endTime - startTime) / 1000000.0;
            System.out.println("n: " + n + ", runs: " + runs + ", time:" + time);
        }
    }

    public static <T> int sort(T[] data, T target) {

        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }

        return -1;
    }

}
