package com.nineya.algo.pta.basic;

import java.util.Scanner;

/**
 * @author linsongwang
 * @date 2020/8/22
 */
public class Main_1007 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while(in.hasNext()){
            int n = in.nextInt();
            int num = 3;
            int s = 0;
            for (int i = 5; i <= n; i++){
                if (isPrimeNum(i)){
                    if (i - num == 2){
                        s++;
                    }
                    num = i;
                }
            }
            System.out.println(s);
        }
    }

    public static boolean isPrimeNum(int num){
        if (num%2==0){
            return false;
        }
        int n = (int) Math.sqrt(num);
        for (int i = 3; i <= n; i+=2){
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }
}
