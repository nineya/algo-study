package com.nineya.algo.pta_basic;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author linsongwang
 * @date 2020/8/22
 */
public class Main_1005 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++){
            set.add(in.nextInt());
        }
        Iterator<Integer> iterator= new ArrayList(set).iterator();
        while (iterator.hasNext()){
            int num = iterator.next();
            if (!set.contains(num)){
                continue;
            }
            if (set.size() == 1){
                break;
            }
            while(num!=2){
                if (num%2==1){
                    num = (3*num + 1)/2;
                }else{
                    num/=2;
                }
                set.remove(num);
            }
        }
        System.out.println(set.stream().sorted((a, b)-> b - a).map(num->num.toString()).collect(Collectors.joining(" ")));
    }
}
