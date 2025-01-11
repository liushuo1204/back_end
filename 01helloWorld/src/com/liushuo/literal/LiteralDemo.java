package com.liushuo.literal;

/**
 * 目标：掌握常见字面量的书写格式
 */
public class LiteralDemo {
    /**
     * 1.字面量这个知识是要求同学们学会什么？
     * 数据在程序中的书写格式。
     * 2.字符、字符串在程序中的书写格式有什么要求？
     * 字符必须单引号围起来，有且仅能一个字符。
     * 字符串必须用双引号围起来。
     * 3.几个常见的特殊值的书写格式是？
     * true、false、null、\r、\t
     */
    public static void main(String[] args) {
        printLiteral();
    }

    public static void printLiteral() {
        // 请帮我直接输出常见的字面量
        // 1.整形字面量，直接写
        System.out.println(1);
        // 2.浮点型字面量，直接写(小数)
        System.out.println(1.0);
        // 3.布尔型字面量，只有 true false
        System.out.println(true);
        System.out.println(false);
        // 4.字符型字面量，用单引号括起来，里面有且只有一个字符
        System.out.println('a');
        System.out.println('铄');
        // System.out.println('刘铄'); // 报错
        System.out.println(' ');
        // System.out.println(''); // 报错

        // 掌握一些特殊字符：\n(换行功能) \t(Tab缩进功能)
        System.out.println("hello\nWorld");
        System.out.println("hello\tWorld");

        // 5.字符串字面量，用双引号括起来，里面可以写任意字符
        System.out.println("aaa");
        System.out.println("   afsfa");
        System.out.println("我爱你中国");
    }
}
