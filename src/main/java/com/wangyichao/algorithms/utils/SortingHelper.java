package com.wangyichao.algorithms.utils;

import java.lang.reflect.Method;

public class SortingHelper {

    /**
     * 检验排序是否正确
     *
     * @param arr
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> boolean isSorted(E[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].compareTo(arr[i]) > 0) {
                return false;
            }
        }

        return true;
    }

    public static <E extends Comparable<E>> void sortTest(String sortName, E[] arr) {
        // 通过Java的反射机制，通过排序的类名，运行排序函数
        try {
            String packageName = "com.wangyichao.algorithms.sort.";
            // 通过sortClassName获得排序函数的Class对象
            Class sortClass = Class.forName(packageName + sortName);
            // 通过排序函数的Class对象获得排序方法
            Method sortMethod = sortClass.getMethod("sort", Comparable[].class);
            // 排序参数只有一个，是可比较数组arr
            Object[] params = new Object[]{arr};

            long startTime = System.currentTimeMillis();
            // 调用排序函数
            sortMethod.invoke(null, params);
            long endTime = System.currentTimeMillis();

            assert isSorted(arr);

            long duration = endTime - startTime;

            System.out.println(sortName + "数据量：" + arr.length + ", 处理时间：" + duration + "毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}