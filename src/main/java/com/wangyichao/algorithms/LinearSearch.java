package com.wangyichao.algorithms;

/**
 * 线性查找法
 */
public class LinearSearch {

    private LinearSearch() {

    }

    public static void main(String[] args) {

        Integer[] data = {24, 18, 12, 9, 16, 66, 32, 4};

        int result = LinearSearch.sort(data, 12);
        System.out.println(result);

        int result2 = LinearSearch.sort(data, 10);
        System.out.println(result2);
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
