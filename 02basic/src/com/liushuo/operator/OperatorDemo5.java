package com.liushuo.operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        // 目标：三元运算符
        print(10, 40);
        print(59);
        System.out.println(getMax(10, 20, 30));
        System.out.println(getMax2(10, 20, 30));
    }

    public static void print(int a, int b) {
        int max = a > b ? a : b;
        System.out.println("较大值:" + max);
    }

    // 需求：判断成绩是否通过或者挂科
    public static void print(int score) {
        String result = score >= 60 ? "通过" : "挂科";
        System.out.println("成绩：" + result);
    }

    // 需求：求三个整数的较大值返回。
    public static int getMax(int a, int b, int c) {
        int max = a > b ? a : b;
        max = max > c ? max : c;
        return max;
    }

    public static int getMax2(int a, int b, int c) {
        // 三元运算符的嵌套
        int max = a > b ? a > c ? a : c : b > c ? b : c;
        return max;
    }
}
