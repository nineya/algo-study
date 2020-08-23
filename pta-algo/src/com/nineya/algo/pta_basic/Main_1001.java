package com.nineya.algo.pta_basic;

import java.util.Scanner;

/**
 * @author linsongwang
 * @date 2020/8/22
 */
public class Main_1001 {
    private static int dt[];
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n=in.nextInt();
            int num=0;
            while(n!=1) {
                if(n%2==1) {
                    n=3*n+1;
                }else {
                    n=n/2;
                    num++;
                }
            }
            System.out.println(num);
        }
    }
}
