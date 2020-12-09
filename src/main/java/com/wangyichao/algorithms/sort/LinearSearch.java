package com.wangyichao.algorithms.sort;

/**
 * 线性查找法
 */
public class LinearSearch {

    private LinearSearch() {

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
