package com.nineya.algo.pta_basic;

import java.util.Scanner;

/**
 * @author linsongwang
 * @date 2020/8/22
 */
public class Main_1004 {
    private static int dt[];
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n=in.nextInt();
            String maxname="";
            String maxno="";
            int max=Integer.MIN_VALUE;
            String minname="";
            String minno="";
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++) {
                String name=in.next();
                String sno=in.next();
                int cj=in.nextInt();
                if(cj>max) {
                    maxname=name;
                    maxno=sno;
                    max=cj;
                }
                if(cj<min) {
                    minname=name;
                    minno=sno;
                    min=cj;
                }
            }
            System.out.println(maxname+" "+maxno);
            System.out.println(minname+" "+minno);
        }
    }
}
