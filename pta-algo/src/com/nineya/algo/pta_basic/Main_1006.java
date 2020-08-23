package com.nineya.algo.pta_basic;

import java.util.Scanner;

/**
 * @author linsongwang
 * @date 2020/8/22
 */
public class Main_1006 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        while(in.hasNext()){
            int a = in.nextInt();
            StringBuilder sb = new StringBuilder();
            int num = a%10;
            a /= 10;
            for (int i = 1; i <= num; i++){
                sb.append(i);
            }
            num = a%10;
            a /= 10;
            for (int i = 0; i < num; i++){
                sb.insert(0, "S");
            }
            num = a%10;
            for (int i = 0; i < num; i++){
                sb.insert(0, "B");
            }
            System.out.println(sb.toString());
        }
    }
}
