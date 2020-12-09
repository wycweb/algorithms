package com.wangyichao.algorithms;

import com.wangyichao.algorithms.bean.Student;
import com.wangyichao.algorithms.sort.SelectionSort;
import com.wangyichao.algorithms.utils.ArrayGenerator;
import com.wangyichao.algorithms.utils.SortingHelper;

import java.util.Arrays;

public class AlgorithmsApp {

    // 测试排序算法辅助函数
    private static Integer[] arr = ArrayGenerator.generateRandomArray(100000, 100000);

    public static void main(String[] args) {
//        selection();
        insert();
    }

    private static void selection() {
        // 测试自定义的类 Student
        Student[] d = new Student[4];
        d[0] = new Student("D", 90);
        d[1] = new Student("C", 100);
        d[2] = new Student("B", 95);
        d[3] = new Student("A", 95);
        SelectionSort.sort(d);
        for (int i = 0; i < d.length; i++)
            System.out.println(d[i]);

        SortingHelper.sortTest("SelectionSort", arr);
    }

    public static void insert() {
        Integer[] arr2 = Arrays.copyOf(arr, arr.length);

//        SortingHelper.sortTest("InsertionSort", arr);
        SortingHelper.sortTest("InsertionSort", "sort3", arr2);
    }

}
