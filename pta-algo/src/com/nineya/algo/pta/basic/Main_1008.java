package com.nineya.algo.pta.basic;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author linsongwang
 * @date 2020/8/22
 */
public class Main_1008 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int m = in.nextInt();
        int n = in.nextInt();
        int[] list = new int[m];
        for (int i = 0; i < m; i++){
            list[(i+n)%m]=in.nextInt();
        }
        System.out.println(Arrays.stream(list).mapToObj(num->String.valueOf(num)).collect(Collectors.joining(" ")));
    }
}
