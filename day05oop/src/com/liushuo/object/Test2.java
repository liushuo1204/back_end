package com.liushuo.object;

public class Test2 {
    /**
     * 1、对象是啥？如何得到？
     * 对象就是一种特殊的数据结构。对象使用类new出来的，有了类就可以创建出对象。
     * 2、面向对象编程这种套路是咋回事？
     * 万物皆对象，谁的数据谁存储
     */
    public static void main(String[] args) {
        // 目标：创建学生对象存储学生数据，并操作学生数据
        Student s1 = new Student();
        s1.name = "播妞";
        s1.chinese = 100;
        s1.math = 100;
        s1.printAllScore();
        s1.printAverageScore();
        System.out.println(s1);

        Student s2 = new Student();
        s2.name = "播仔";
        s2.chinese = 50;
        s2.math = 100;
        s2.printAllScore();
        s2.printAverageScore();
        System.out.println(s2);
    }
}
