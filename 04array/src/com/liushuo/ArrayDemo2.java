package com.liushuo;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 目标：掌握数组的另一种定义方式，动态初始化数组。
        inputScore();
    }

    // 设计一个方法录入学生成绩
    public static void inputScore() {
        // 1、你需要一个数组来存储8名学生的成绩。
        // 动态初始化数组，只确定数组的类型和存储数据的容量，不事先存入具体的数据。
        // 数据类型[] 数组名 = new 数据类型[数组长度];
        double[] scores = new double[8];
        // scores = [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
        //            0    1    2    3    4    5    6    7

        // 2、录入8名学生的成绩，存入到数组中去
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            // i = 0 1 2 3 4 5 6 7
            System.out.println("请输入第" + (i + 1) + "个学生的成绩:");
            scores[i] = sc.nextDouble();
        }

        // 3、遍历数组，统计总分，统计最高分，统计最低分。
        double allScore = scores[0];
        double maxScore = scores[0];
        double minScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            // i = 0 1 2 3 4 5 6 7
            double score = scores[i];
            // 4、累加当前遍历到的分数
            allScore += score;

            // 5、找出最高分
            if (score > maxScore) {
                maxScore = score;
            }

            // 6、找出最低分
            if (score < minScore) {
                minScore = score;
            }
        }
        System.out.println("平均分：" + allScore / scores.length);
        System.out.println("最高分：" + maxScore);
        System.out.println("最低分：" + minScore);
    }
}
