package com.liushuo.demo;

public class Test4 {
    public static void main(String[] args) {
        // 目标：找出 101~200之间的全部素数
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            // i = 101 102 103 ... 200
            // 2、每遍历到一个数字，判断这个数字是否是素数，是则输出。（独立功能独立成方法）
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("素数的个数是：" + count);
    }

    public static boolean isPrime(int num) {
        // num = 101 / 102
        // 定义一个循环从2开始，找到该数的一半，只要发现有一个整数num这个数，num就不是素数
        // 如果都没有找到，那么num就是素数
        for (int i = 2; i <= num / 2; i++) {
            // i = 2 3 4 5 ...
            // 2、判断num是否被i整除，能则返回false，不能则返回true
            if (num % i == 0) {
                return false;
            }
        }
        return true; // 是素数。
    }
}
