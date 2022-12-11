package cn.com.snnile.leetcode;

import java.util.HashMap;

/*
 * 《无重复字符的最长子串》
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 输入：s = "abcabcbb"
 * 输出：3
 * 解释：因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 输入：s = "pwwkew"
 * 输出：3
 * 解释：因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *
 * 输入：s = "bbbbb"
 * 输出：1
 * 解释：因为无重复字符的最长子串是 "b"，所以其长度为 1。
 */
public class LengthOfLongestSubString {

    public static void main(String[] args) {
        String input = "pwwkew";
        getLength(input);
    }

    public static void getLength(String input) {
        if (input.length() == 0) {
            System.out.println(0);
        }

        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        for (int i = 0; i < input.length(); i++) {
            if (map.containsKey(input.charAt(i))) {
                left = Math.max(left, map.get(input.charAt(i)) + 1);
            }
            map.put(input.charAt(i), i);
            maxLength = Math.max(maxLength, i - left + 1);
        }
        System.out.print(maxLength);
    }

}