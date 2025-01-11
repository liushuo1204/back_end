package com.liushuo.operator;

/**
 * 自增、自减运算符是什么，有什么作用，需要注意什么？
 * ++、--；对当前变量值+1、-1
 * 只能操作变量，不能操作字面量
 * 自增、自减运算符放在变量前后有区别吗？
 * 如果单独使用放前后是没有去别的。
 * 非单独使用：在变量前，先进行变量自增/自减，再使用变量。
 */
public class OperatorDemo2 {
    public static void main(String[] args) {
        // 目标：理解自增自减运算符
        print(10);
        System.out.println("=========================");
        print2(10);
    }

    // 设计一个方法，接收一个整数。
    public static void print(int a) {
        a++; // a = a + 1;
        ++a; // a = a + 1;
        System.out.println(a);

        a--;
        --a;
        System.out.println(a);
    }

    // 设计一个方法，理解自增和自减放在变量前后的区别
    public static void print2(int a) {
        int b = a++; // 先用后加
        System.out.println(a); // 11
        System.out.println(b); // 10

        int c = ++a; // 先加后用
        System.out.println(a); // 12
        System.out.println(c); // 12
    }
}
