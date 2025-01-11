package com.liushuo.variable;

/**
 * 数据类型分为几种？
 * 基本数据类型：4大类8种。
 * byte short int(默认) long 整形
 * float double(默认) 浮点型
 * char 字符型
 * boolean 布尔型
 * 引用数据类型：String
 * 随便写的整数、小数字面量，它们默认是什么类型？
 * 23，默认是int类型，加上L或者l，就是long类型的数据了。
 * 23.8，默认是double类型，加上F或者f，就是float类型的数据了。
 */
public class VariableDemo2 {
    /**
     * 什么是关键字？需要注意什么？
     * 关键字就是Java自己要用的的词，并且有特殊含义的一些词。
     * 我们不能用来作为：类名、变量名、否则会报错！
     * 什么是标识符？需要注意什么？
     * 标识符就是名字。
     * 标识符的规则：由数字，字母，下划线，美元符等组成，且不能数字开头，不能用关键字，不能用特殊符号（&、%）
     */
    public static void main(String[] args) {
        // 目标：掌握8种基本数据类型定义变量
        printVariable();
    }

    // 请帮我设计一个方法，打印出8种基本数据类型定义的变量。
    public static void printVariable() {
        // 1.整形
        byte b = 10;
        // byte b2 = 128; // 越界了，报错
        short s = 20;
        int i = 30;
        // 注意：随便写一个整数字面量默认是int类型的，33434454545455这个数据虽然没有超过long的范围，但是超过了int的范围，所以报错
        // 如果希望33434454545455这个是long类型，需要显示的指定，加上L或者l
        long l1 = 33434454545455L;
        long l2 = 40;

        // 2.浮点型
        // 注意：随便写一个浮点数字面量默认是double类型的，如果希望1.1是float类型，需要显示的指定，加上F或者f
        // float f2 = 1.1;
        float f = 1.1f;
        double d = 2.2;

        // 3.字符型
        char c = 'a';

        // 4.布尔型
        boolean flag = true;
        boolean flag2 = false;

        // 5.字符串型（引用数据类型，后面再讲）：定义字符串变量记住字符串数据的
        String str = "hello";
        System.out.println(str);
    }
}
