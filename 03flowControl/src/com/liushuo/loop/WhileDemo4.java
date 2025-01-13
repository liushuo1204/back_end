package com.liushuo.loop;

public class WhileDemo4 {
    /**
     * 1、while循环的格式，执行流程是怎么样的？
     * 初始化语句;
     * while(循环条件){
     * 循环体语句;
     * 迭代语句;
     * }
     * int i = 0;
     * while(i < 3){
     * System.out.println("Hello World!");
     * i++;
     * }
     * 2、while和for有什么区别？什么时候用for，什么时候用while？
     * 功能上是完全一样的，for循环能解决的while也能解决，反之亦然。
     * 使用规范：知道循环几次：使用for；不知道循环几次建议使用：while。
     */
    public static void main(String[] args) {
        // 目标：认识while循环的写法，搞清楚其执行流程。
        test1();
    }

    public static void test1() {
        int i = 0;
        while (i < 3) {
            System.out.println("Hello World!");
            i++;
        }
    }
}
