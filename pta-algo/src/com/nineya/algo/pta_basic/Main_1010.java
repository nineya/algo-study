package com.nineya.algo.pta_basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author linsongwang
 * @date 2020/8/22
 */
public class Main_1010 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        boolean bool = false;

        List<Integer> nums = new ArrayList<>();
        while (in.hasNext()) {
            int a = in.nextInt();   //系数
            int b = in.nextInt();  //指数

            //判断是否为0的指数
            if (b != 0) {
                nums.add(a*b);
                nums.add(b-1);
            }else {
                if (nums.size() == 0){
                    nums.add(0);
                    nums.add(0);
                }
                break;
            }
        }
        System.out.println(nums.stream().map(n->String.valueOf(n)).collect(Collectors.joining(" ")));
    }
}
