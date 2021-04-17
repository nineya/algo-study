package com.nineya.algo.leetcode.concurrency;

/**
 * @author 殇雪话诀别
 * 2021/4/18
 */
class FooBar {
    private int n;
    private volatile boolean flag;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) {

        for (int i = 0; i < n; i++) {
            while (flag) {
                Thread.yield();
            }

            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            flag = true;
        }
    }

    public void bar(Runnable printBar) {

        for (int i = 0; i < n; i++) {
            while (!flag) {
                Thread.yield();
            }
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            flag = false;
        }
    }
}

public class Solution_1115 {
    public static void main(String[] args) {
        final FooBar fooBar = new FooBar(5);
        new Thread(()->{
            fooBar.bar(()->{
                System.out.println("bar");
            });
        }).start();
        new Thread(()->{
            fooBar.foo(()->{
                System.out.println("foo");
            });
        }).start();
    }
}
