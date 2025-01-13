package com.liushuo.loop;

public class ForForDemo8 {
    public static void main(String[] args) {
        // 目标：搞清楚循环嵌套的流程。
        test();
        print99();
    }

    public static void test() {
        // 需求：打印4行5列星星。
        // 1、定义一个循环打印几行。
        for (int i = 1; i <= 4; i++) {
            // 2、定义一个循环控制每行打印多少个星星
            for (int j = 1; j <= 5; j++) {
                System.out.print("*"); // 不换行打印
            }
            // 3、打印完一行需要换行。
            System.out.println(); // 换行
        }
    }

    // 定义一个方法
    public static void print99() {
        // 1、定义一个循环控制打印多少行
        for (int i = 1; i <= 9; i++) {
            // i = 1 2 3 4 5 6 7 8 9
            // 2、定义循环打印控制打印当前行的列信息。
            for (int j = 1; j <= i; j++) {
                // 3、打印每列的信息
                System.out.print(j + "x" + i + "=" + (j * i) + "\t");
            }
            // 3、换行
            System.out.println();
        }
    }
}
