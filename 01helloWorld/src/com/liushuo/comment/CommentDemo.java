package com.liushuo.comment;

/**
 * 注释是什么？
 * 写在程序中对程序进行解释说明的文字
 * Java程序中书写注释的方式有几种，各自有什么不同？
 * 单行注释：//
 * 多行注释：
 * 文本注释：
 * 注释有什么特点？为什么？
 * 不影响程序的执行，编译后的class文件中已经没有注释了。
 * 3.文档注释
 * 这是一个程序
 * 是用来讲解注释的使用
 */
public class CommentDemo {
    /**
     * 这是一个main方法，是程序的入口
     * 必须有这个main方法，程序才能执行
     */
    public static void main(String[] args) {
        // 目标：认识三种注释的写法
        // 1.单行注释
        // 打印2行诗句
        System.out.println("我欲乘风归去，又恐琼楼玉宇");
        /*
         * 2.多行注释
         * 打印3行诗句，依次打印
         * */
        System.out.println("人未识，心已明");
        System.out.println("人已识，心未明");
        System.out.println("人已识，心已明");
    }
}
