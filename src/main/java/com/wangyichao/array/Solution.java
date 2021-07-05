package com.wangyichao.array;

import java.util.HashMap;

/**
 * 链接：https://www.nowcoder.com/questionTerminal/6fe361ede7e54db1b84adc81d09d8524
 * 来源：牛客网
 * <p>
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的。
 * 也不知道每个数字重复几次。请找出数组中任一一个重复的数字。
 * 例如，如果输入长度为7的数组[2,3,1,0,2,5,3]，那么对应的输出是2或者3。存在不合法的输入的话输出-1
 */
public class Solution {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 1, 0, 2, 5, 3};

        System.out.println(duplicate(numbers));
        System.out.println(duplicate2(numbers));
    }

    /**
     * 利用map数组完成。
     */
    public static int duplicate(int[] numbers) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int number : numbers) {
            if (map.containsKey(number)) {
                return number;
            } else {
                map.put(number, number);
            }
        }

        return -1;
    }


    //解题思路
    /*替换法（O(n),O(1)）
    数组存放原则：numbers[i] = i
    遍历数组所有元素，交换不符合数组存放原则的元素：
        例如[2,3,1,0,2]
        遍历0位元素2：（交换0位元素2和2位元素1）->[1,3,2,0,2]
        遍历0位元素1：（交换0位元素1和1位元素3）->[3,1,2,0,2]
        遍历0位元素3：（交换0位元素3和3位元素0）->[0,1,2,3,2]
        依次遍历0、1、2、3位置元素，都符合存放原则numbers[i] = i，不做任何操作
        遍历末位元素2，此时末位元素2和2位元素2相等，出现了两次，即数字2位重复元素
     */
    public static int duplicate2(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != i) {
                if (numbers[i] == numbers[numbers[i]]) return numbers[i];
                int temp = numbers[numbers[i]];
                numbers[numbers[i]] = numbers[i];
                numbers[i] = temp;
                i--;//遍历完0位元素以及交换完数字后，如果0位元素仍不符合数组存放原则：numbers[i] = i，那么还要重新遍历0位元素
            }
        }
        return -1;
    }
}