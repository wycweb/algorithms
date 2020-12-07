package com.wangyichao.algorithms.sort;

import com.wangyichao.algorithms.bean.Student;
import com.wangyichao.algorithms.utils.ArrayGenerator;
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

            swap(data, i, minIndex);
        }

    }

    public static <E> void swap(E[] data, int i, int j) {
        E tmp = data[i];

        data[i] = data[j];
        data[j] = tmp;
    }

    public static void main(String[] args) {

        Integer[] data = {10000, 100000};

        Student[] students = {
                new Student("a", 10),
                new Student("b", 8),
                new Student("c", 5),
        };

        SelectionSort.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }


        for (int n : data) {
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);

            SortingHelper.sortTest("SelectionSort", arr);
        }

    }
}
