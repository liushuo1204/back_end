package com.liushuo.thisdemo;

public class Test {
    /**
     * 1、this关键字是什么？
     * this就是一个变量，可以用在方法中，用来拿到当前对象？哪个对象调用方法，this就指向哪个对象，也就是拿到哪个对象。
     * 2、this关键字啊在实际开发中常用来干啥？
     * 用来解决对象的成员变量与方法内部变量的名称一样时，导致访问冲突问题的。
     */
    public static void main(String[] args) {
        // 目标：认识this关键字，搞清楚this关键字的应用场景等。
        Student s1 = new Student();
        s1.name = "张三";
        s1.print();
        System.out.println(s1);

        System.out.println("==========");

        Student s2 = new Student();
        s2.print();
        System.out.println(s2);

        System.out.println("==========");

        Student s3 = new Student();
        s3.name = "汪苏泷";
        s3.printHobby("唱歌");
    }
}
