package com.liushuo.branch;

public class SwitchDemo4 {
    /**
     * 1、使用switch时有哪些注意事项？
     * 表达式类型只能是byte、short、int、char，JDK5开始支持枚举，JDK7开始支持String、不支持double、float、long。
     * case给出的值不允许重复，且只能是字面量，不能是变量。
     * 正常使用switch的时候，不要忘记写break，否则会出现穿透现象。
     * 2、switch穿透性能解决什么问题？
     * 存在多个case分支的代码是一样时，可以把代码写到一个case块，其他case块通过穿透性能，穿透到该case块即可，这样可以简化代码。
     */
    public static void main(String[] args) {
        // 目标：搞清楚switch的注意事项，穿透性的应用。
        test1();
        test3();
    }

    // 1.switch的表达式类型只能是byte、short、int、char，JDK5开始支持枚举，JDK7开始支持String、不支持double、float、long。
    public static void test1() {
//        double a = 0.1 + 0.2;
//        switch (a) {
//            case 0.3;
//                System.out.println("10.5");
//            case 10.8;
//                System.out.println("10");
//            default:
//                System.out.println("default");
//        }
    }

    // 2.case给出的值不允许重复，且只能是字面量，不能是变量。
    public static void test2() {
        int a = 10;
        int b = 15;
        switch (a) {
            case 10:
                System.out.println("1");
                break;
            case 15:
                System.out.println("2");
                break;
            default:
                System.out.println("default");
        }
    }

    // 3.正常使用switch的时候，不要忘记写break，否则会出现穿透现象。
    // 穿透性的作用：相同程序的case块，可以通过穿透性进行合并，建设重复代码的书写。
    // 周一：埋头苦干，解决bug        周五：自己整理代码
    // 周二：请求大牛程序员帮忙        周六：打游戏
    // 周三：请求大牛程序员帮忙        周日：打游戏
    // 周四：请求大牛程序员帮忙
    public static void test3() {
        String week = "周二";
        switch (week) {
            case "周一":
                System.out.println("埋头苦干，解决bug");
                break;
            case "周二":
            case "周三":
            case "周四":
                System.out.println("请求大牛程序员帮忙");
                break;
            case "周五":
                System.out.println("自己整理代码");
                break;
            case "周六":
            case "周日":
                System.out.println("打游戏");
                break;
            default:
                System.out.println("星期信息有误");
        }
    }
}
