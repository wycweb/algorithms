package com.wangyichao.algorithms.lecode;

import java.util.HashMap;

public class Demo {

    /**
     * 在数组中，找到两个数的和为目标数字的值，并将两个数的索引返回
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {

        int[] ints = new int[]{1, 3, 4, 5, 6, 7, 8, 9, 20};
        int target = 29;
        twoSum(ints, target);
    }
}
