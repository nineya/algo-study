package com.nineya.algo.leetcode.algorithms;

import java.util.Stack;

/**
 * @author 殇雪话诀别
 * 2021/4/16
 */
public class Solution_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if (chars[i] == '{' || chars[i] == '[' || chars[i] == '(') {
                stack.add(chars[i]);
                continue;
            }
            if (stack.empty()) {
                return false;
            }
            char c = stack.pop();
            if (chars[i] == '}') {
                if (c != '{') {
                    return false;
                }
            } else if (chars[i] == ']') {
                if (c != '[') {
                    return false;
                }
            } else {
                if (c != '(') {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        Solution_20 solution = new Solution_20();
        System.out.println(solution.isValid("()"));
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("([)]"));
        System.out.println(solution.isValid("{[]}"));
        System.out.println(solution.isValid("["));
    }
}
