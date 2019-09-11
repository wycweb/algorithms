package com.wycweb.algorithms;

import com.wycweb.algorithms.common.SortTestHelper;
import com.wycweb.algorithms.sort.SelectionSort;
import com.wycweb.algorithms.sort.Student;

public class AlgorithmsApp {

    public static void main(String[] args) {
        AlgorithmsApp.selection();  //选择排序 时间复杂度读 O(N方)
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


        // 测试排序算法辅助函数
        int N = 20000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        SortTestHelper.testSort("com.wycweb.algorithms.sort.SelectionSort", arr);
    }
}
