package com.wycweb.algorithms.sort;

import com.wycweb.algorithms.common.SortTestHelper;

/**
 * 插入排序
 * 时间复杂度：O(n^2)
 * 从第二个位置开始，第一个位置元素不用处理
 * 比较第一个元素和第二个元素大小关系。如果 第二个比第一个小，1和2交换位置
 * 接下来处理第三个元素，比较第二个元素和第三个元素大小关系。如果 第三个比第一个小，2和3交换位置，再重复第一个元素和第二个元素的大小比较。
 * <p>
 * 在比较过程中，如果当前元素比前一个位置的元素大，此时可以终止比较，进行下一位置的比较算法
 */

public class InsertionSort {

    //插入排序比较过程中可以提前终止排序 所以对于一些比较有序的数据 插入排序效率会很高
    //1 冒泡排序选学 冒泡排序整体性能不如插入排序
    //2 插入排序延伸出希尔排序 理解希尔排序 希尔排序排序 n的2分之3次方 比n方低 比logn高 但是实现简单
    public static void sort(Comparable[] arr) {
        int length = arr.length;

        //插入排序从第二个元素开始即可,因为第一个位置元素无比较,肯定不会做处理
        for (int i = 1; i < length; i++) {

            Comparable tmp = arr[i];    //保存每次需要插入的那个数

            int j = i;

            for( ; j > 0 && arr[j-1].compareTo(tmp) > 0 ; j--) {  //从比较位置开始,依次向前找,将 tmp 值和tmp一位置的值进行比较
                arr[j] = arr[j - 1];                              //如果tmp值小与前一位,将tmp前的数据向后移动 -----如果tmp大等于前一位，说明tmp的值已经处于最前的位置了
            }

            arr[j] = tmp;                                         //tmp的值,存入到查找到的位置
        }
    }

}
