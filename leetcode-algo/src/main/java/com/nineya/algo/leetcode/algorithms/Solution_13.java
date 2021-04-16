package com.nineya.algo.leetcode.algorithms;

/**
 * @author 殇雪话诀别
 * 2021/4/16
 */
public class Solution_13 {
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int n = 0;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'I': {
                    if (i + 1 < chars.length) {
                        if (chars[i + 1] == 'V') {
                            n += 4;
                            i++;
                        } else if (chars[i + 1] == 'X') {
                            n += 9;
                            i++;
                        } else {
                            n += 1;
                        }
                    } else {
                        n += 1;
                    }
                    break;
                }
                case 'V' : {
                    n+= 5;
                    break;
                }
                case 'X' : {
                    if (i + 1 < chars.length) {
                        if (chars[i + 1] == 'L') {
                            n += 40;
                            i++;
                        } else if (chars[i + 1] == 'C') {
                            n += 90;
                            i++;
                        } else {
                            n += 10;
                        }
                    } else {
                        n += 10;
                    }
                    break;
                }
                case 'L' : {
                    n+= 50;
                    break;
                }
                case 'C' : {
                    if (i + 1 < chars.length) {
                        if (chars[i + 1] == 'D') {
                            n += 400;
                            i++;
                        } else if (chars[i + 1] == 'M') {
                            n += 900;
                            i++;
                        } else {
                            n += 100;
                        }
                    } else {
                        n += 100;
                    }
                    break;
                }
                case 'D' : {
                    n+= 500;
                    break;
                }
                case 'M' : {
                    n+= 1000;
                    break;
                }
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Solution_13 solution = new Solution_13();
        System.out.println(solution.romanToInt("III"));
        System.out.println(solution.romanToInt("IV"));
        System.out.println(solution.romanToInt("LVIII"));
        System.out.println(solution.romanToInt("MCMXCIV"));
    }
}
