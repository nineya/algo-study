package com.nineya.algo.leetcode.concurrency;

/**
 * @author 殇雪话诀别
 * 2021/4/18
 */
class Foo {
    private volatile int i = 0;

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        i++;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (i != 1){

        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        i++;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (i != 2){

        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
public class Solution_1114 {
}
