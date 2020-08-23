package com.nineya.algo.pta_basic;

import java.util.Scanner;

/**
 * @author linsongwang
 * @date 2020/8/22
 */
public class Main_1009 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in.hasNext()){
            String s[] = in.nextLine().split(" ");
            System.out.print(s[s.length-1]);
            for (int i = s.length-2; i >=0; i--){
                System.out.print(" " + s[i]);
            }
            System.out.println();
        }
    }
}
