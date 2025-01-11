package com.liushuo.demo;

import java.util.Scanner;

public class AllTest {
    public static void main(String[] args) {
        // 目标：完成健康计算器。
        Scanner sc = new Scanner(System.in);
        // 1.先让用户输入自己的个人信息：身高、体重、性别、年龄
        System.out.println("请输入您的身高（米）：");
        double height = sc.nextDouble();

        System.out.println("请输入您的体重（千克）：");
        double weight = sc.nextDouble();

        System.out.println("请输入您的性别（男/女）：");
        String sex = sc.next(); // "男"、"女"

        System.out.println("请输入您的年龄（数字）：");
        int age = sc.nextInt();

        double bmi = calcBMI(height, weight);
        System.out.println("您的BMI指数为：" + bmi);

        // 判断用户的bmi值的情况

        double bmr = calcBMR(height, weight, sex, age);
        System.out.println("您的基础代谢量（BMR）为：" + bmr);

        // 判断bmr的情况
    }

    // 2.根据个人信息，计算BMI指数（把数据交给一个独立的方法来计算并返回这个结果）
    public static double calcBMI(double height, double weight) {
        return weight / (height * height);
    }

    // 3.根据个人信息，计算BMR指数（把数据交给一个独立的方法来计算并返回这个结果）
    public static double calcBMR(double height, double weight, String sex, int age) {
        double bmr = 0;
        if (sex.equals("男")) {
            bmr = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
        } else {
            bmr = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);
        }
        return bmr;
    }
}
