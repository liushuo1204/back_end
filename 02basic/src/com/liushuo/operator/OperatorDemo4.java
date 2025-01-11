package com.liushuo.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        // 目标：理解关系运算符。
        print(10, 2);
        print2(10, 10);
    }

    public static void print(int a, int b) {
        boolean result = a > b;
        System.out.println(result);

        System.out.println(a > b); // true
        System.out.println(a < b); // false
        System.out.println(a >= b); // true 要么大于要么等于
        System.out.println(a <= b); // true 要么小于要么等于
        System.out.println(a == b); // false
        System.out.println(a != b); // true
    }

    public static void print2(int a, int b) {
        System.out.println(a > b); // fasle
        System.out.println(a < b); // false
        System.out.println(a >= b); // true
        System.out.println(a <= b); // true
        System.out.println(a == b); // true
        System.out.println(a != b); // fasle
    }
}
