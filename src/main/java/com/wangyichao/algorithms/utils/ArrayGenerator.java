package com.wangyichao.algorithms.utils;

import java.util.Random;

public class ArrayGenerator {

    private ArrayGenerator() {
    }

    /**
     * 生成顺序的数组
     *
     * @param n
     * @return
     */
    public static Integer[] generateOrderedArray(int n) {
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        return arr;
    }

    /**
     * 生成长度为bound的随机数组
     *
     * @param n
     * @param bound
     * @return
     */
    public static Integer[] generateRandomArray(int n, int bound) {
        Integer[] arr = new Integer[n];

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(bound);
        }

        return arr;
    }

}
