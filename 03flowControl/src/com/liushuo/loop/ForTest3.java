package com.liushuo.loop;

public class ForTest3 {
    public static void main(String[] args) {
        // 目标：求奇数和
        System.out.println("1~10的奇数和是：" + sum(10));
        System.out.println("1~10的奇数和是：" + sum2(10));
    }

    public static int sum(int n) {
        // 1、定义变量累加奇数
        int sum = 0;
        // 2、循环1~n的全部数字。
        for (int i = 1; i <= n; i++) {
            // i = 1 2 3 4 5 6 7 8 9 10
            // 3、判断当前数字是否是奇数
            if (i % 2 == 1) {
                // 4、如果是奇数，累加到sum中
                sum += i;
            }
        }
        // 5、返回累加结果
        return sum;
    }

    public static int sum2(int n) {
        // 1、定义变量的累加奇数
        int sum = 0;
        // 2、循环1~n的全部数字。
        for (int i = 1; i <= n; i += 2) {
            // i = 1 3 5 7 9
            // 3、累加到sum中
            sum += i;
        }
        // 4、返回累加结果
        return sum;
    }
}
