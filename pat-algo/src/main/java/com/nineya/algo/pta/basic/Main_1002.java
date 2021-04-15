package com.nineya.algo.pta.basic;

import java.util.Scanner;

/**
 * @author linsongwang
 * @date 2020/8/22
 */
public class Main_1002 {
    private static int dt[];
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            char[] n=in.next().toCharArray();
            int num=0;
            for(int i=0;i<n.length;i++) {
                num+=n[i]-'0';
            }
            char[] s=(num+"").toCharArray();
            switch(s[0]) {
                case '0':System.out.print("ling");break;
                case '1':System.out.print("yi");break;
                case '2':System.out.print("er");break;
                case '3':System.out.print("san");break;
                case '4':System.out.print("si");break;
                case '5':System.out.print("wu");break;
                case '6':System.out.print("liu");break;
                case '7':System.out.print("qi");break;
                case '8':System.out.print("ba");break;
                case '9':System.out.print("jiu");break;
            }
            for(int i=1;i<s.length;i++) {
                switch(s[i]) {
                    case '0':System.out.print(" ling");break;
                    case '1':System.out.print(" yi");break;
                    case '2':System.out.print(" er");break;
                    case '3':System.out.print(" san");break;
                    case '4':System.out.print(" si");break;
                    case '5':System.out.print(" wu");break;
                    case '6':System.out.print(" liu");break;
                    case '7':System.out.print(" qi");break;
                    case '8':System.out.print(" ba");break;
                    case '9':System.out.print(" jiu");break;
                }
            }
            System.out.println();
        }
    }
}
