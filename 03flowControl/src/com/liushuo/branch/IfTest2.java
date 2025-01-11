package com.liushuo.branch;

public class IfTest2 {
    public static void main(String[] args) {
        // 目标：完成自动汽车驾驶程序的书写，以便可以根据红绿灯状态正确形式。
        test1();
    }

    public static void test1() {
        // 1.假设在通过摄像头获取到了三种灯的状态信息如下
        boolean red = false;
        boolean yellow = false;
        boolean green = false;

        // 2.使用if语句判断红灯亮灭的情况，并输出对应的提示信息。
        if (red) {
            System.out.println("红灯，停止！");
        } else if (yellow) {
            System.out.println("黄灯，减速！");
        } else if (green) {
            System.out.println("绿灯，继续！");
        } else {
            System.out.println("灯泡故障，停止！");
        }
    }
}
