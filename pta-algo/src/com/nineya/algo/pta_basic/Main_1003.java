package com.nineya.algo.pta_basic;

import java.util.Scanner;

/**
 * @author linsongwang
 * @date 2020/8/21
 */
public class Main_1003 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        for (int i = 0; i < n; i++){
            String str = in.next();
            if (!str.matches("A*PA+TA*")){
                System.out.println("NO");
                continue;
            }
            char[] ss = str.toCharArray();
            int a = 0;
            int b = 0;
            int c = 0;
            boolean flag = false;
            for (char s : ss){
                switch (s){
                    case 'A':{
                        c++;
                        break;
                    }
                    case 'P':{
                        a = c;
                        c = 0;
                        break;
                    }
                    case 'T':{
                        if (c==0){
                            flag = true;
                            break;
                        }
                        b = c;
                        c = 0;
                        break;
                    }
                    default:{
                        flag = true;
                        break;
                    }
                }
            }
            if (flag){
                System.out.println("NO");
                continue;
            }
            if ((a == 0 && c == 0) || a * b == c){
                System.out.println("YES");
                continue;
            }
            System.out.println("NO");
        }
    }
}
