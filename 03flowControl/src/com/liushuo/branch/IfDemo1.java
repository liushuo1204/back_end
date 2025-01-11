package com.liushuo.branch;
/**
 * if分支是什么？举几个应用场景？
 * 可以根据条件，选择执行某段程序。
 * if分支的写法有几种？各有什么特点？
 * if(条件表达式){
 * 语句体;
 * }
 * <p>
 * if(条件表达式){
 * 语句体1;
 * } else{
 * 语句体2;
 * }
 * <p>
 * if(条件表达式){
 * 语句体1;
 * } else if(条件表达式){
 * 语句体2;
 * } else if(条件表达式){
 * 语句体3;
 * }
 * ...
 * else {
 * 语句体n+1;
 * }
 */

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        // 目标：认识if语句，搞清楚其写法和应用场景。（独立功能独立成方法）
        test1();
        test2();
        test3();
    }

    public static void test1() {
        int age = 20;
        if (age > 18) {
            System.out.println("可以上网");
        }
        System.out.println("洗洗睡吧！");
        // 注意：if语句中如果只有一行代码，大括号可以省略不写
    }

    public static void test2() {
        // 需求：假如你的钱包金额是90元，现在要转出去80元，请用if分支实现
        // 要求：钱够就提示转账成功，钱不够就提示余额不足。
        int money = 10;
        if (money >= 80) {
            System.out.println("转账成功");
        } else {
            System.out.println("余额不足");
        }
    }

    public static void test3() {
        // 需求：有个绩效系统，每个月由主管给员工打分。
        // 会输出这个月的绩效级别：A B C D
        // 级别区间情况：A+ 90-100 A 80-90 B 70-80 C 60-70 D 0-60
        System.out.println("请你录入该员工的分数：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("A+");
        } else if (score >= 80 && score < 90) {
            System.out.println("A");
        } else if (score >= 70 && score < 80) {
            System.out.println("B");
        } else if (score >= 60 && score < 70) {
            System.out.println("C");
        } else if (score >= 0 && score < 60) {
            System.out.println("D");
        } else {
            System.out.println("分数输入有误！");
        }
    }
}
