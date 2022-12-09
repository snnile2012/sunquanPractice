package cn.com.snnile.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * 《两数之和》
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 */
public class TwoNumSum {

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;

        // O(N^2)
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (first + nums[j] == target) {
                    flag = true;
                    System.out.println("O(N^2):" + i + "," + j);
                    break;
                }
            }
            if (flag) {
                break;
            }
        }

        // O(N)
        Map<Integer, Integer> hashMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                int first = hashMap.get(target - nums[i]);
                System.out.println("O(N):" + first + "," + i);
                break;
            }
            hashMap.put(nums[i], i);
        }

    }

}
