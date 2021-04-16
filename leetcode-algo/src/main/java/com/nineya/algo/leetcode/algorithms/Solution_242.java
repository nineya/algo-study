package com.nineya.algo.leetcode.algorithms;

/**
 * @author 殇雪话诀别
 * 2021/4/16
 */
public class Solution_242 {
    public boolean isAnagram(String s, String t) {
        int[] n = new int[26];
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            n[c[i]-'a']++;
        }
        c = t.toCharArray();
        for (int i = 0; i < c.length; i++) {
            n[c[i]-'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (n[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution_242 solution = new Solution_242();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
        System.out.println(solution.isAnagram("rat", "car"));
    }
}
