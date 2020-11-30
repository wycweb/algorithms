package com.wangyichao.algorithms;

import com.wangyichao.algorithms.common.SortTestHelper;
import com.wangyichao.algorithms.sort.Student;
import com.wangyichao.algorithms.sort.SelectionSort;

public class AlgorithmsApp {

    // 测试排序算法辅助函数
    private static Integer[] arr = SortTestHelper.generateRandomArray(100000, 0, 100000);

    public static void main(String[] args) {
        AlgorithmsApp.selection();  //选择排序 时间复杂度 O(n^2)
        AlgorithmsApp.insertion();  //插入排序 时间复杂度 O(n^2)
        AlgorithmsApp.pop();
        AlgorithmsApp.merge();
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

        SortTestHelper.testSort("com.wangyichao.algorithms.sort.SelectionSort", arr);
    }

    private static void insertion() {
        SortTestHelper.testSort("com.wangyichao.algorithms.sort.InsertionSort", arr);
    }

    private static void pop() {
        SortTestHelper.testSort("com.wangyichao.algorithms.sort.BubbleSort", arr, true);
    }

    private static void merge() {
        SortTestHelper.testSort("com.wangyichao.algorithms.sort.MergeSort", arr);
    }
}
