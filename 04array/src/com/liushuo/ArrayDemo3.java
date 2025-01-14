package com.liushuo;

public class ArrayDemo3 {
    public static void main(String[] args) {
        // 目标：完成数组求最值
        int[] scores = {15, 9000, 10000, 20000, 9500, -5};
        int max = getMax(scores);
        System.out.println("最大颜值是：" + max);
    }

    // 设计一个方法，求数组的最大值返回。
    public static int getMax(int[] arr) {
        // arr = {15, 9000, 10000, 20000, 9500, -5};
        //        0     1      2     3      4    5
        // 1、定义一个变量用于记录当前最大值，建议用第一个数据作为参照物。
        int max = arr[0];

        // 2、从数组的第二个位置开始遍历
        for (int i = 1; i < arr.length; i++) {
            // 3、一次和参照物比较，如果比参照物大，则更新参照物。
            int data = arr[i];
            if (arr[i] > max) {
                max = data;
            }
        }

        // 4、返回最大值
        return max;
    }
}
