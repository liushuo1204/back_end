package com.liushuo.type;

/**
 * 为什么要进行类型转换？
 * 存在不同类型的变量赋值给其他类型的变量
 * 什么是自动类型转换？
 * 类型范围小的变量，可以直接赋值给类型范围大的变量。
 * 什么是强制类型转换？
 * 默认情况下，大范围类型的变量直接赋值给小范围类型的发变量会报错！
 * 可以强行将类型范围大的变量、数据赋值给类型范围小的变量
 * 数据类型 变量 = （数据类型） 变量 数据
 * 强制类型转换有哪些需要注意的？
 * 可能出现数据丢失
 * 小数强制转换成整数是直接截断小数保留整数。
 */
public class TypeDemo1 {
    public static void main(String[] args) {
        // 目标：认识自动类型转换，强制类型转换。
        byte a = 12;
        print(a); // 自动类型转换
        print2(a); // 自动类型转换

        System.out.println("===================");

        int i = 20;
        // print3(i); // 类型范围大的变量不能直接赋值给类型小的变量，会报错的！！

        // 强制类型转换 类型 变量2 = (类型) 变量1
        byte j = (byte) i; // 强制类型转换
        print3(j);

        int m = 1500;
        byte n = (byte) m;
        System.out.println(m);
        System.out.println(n); // 出现数据溢出！！

        System.out.println("===================");

        double k = 3.14;
        int l = (int) k; // 浮点型转换成整数，直接去掉小数点部分！！
        System.out.println(l); // 3
    }

    public static void print(int b) {
        System.out.println(b);
    }

    public static void print2(double c) {
        System.out.println(c);
    }

    public static void print3(byte j) {
        System.out.println(j);
    }
}
