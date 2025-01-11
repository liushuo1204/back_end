package com.liushuo.method;

/**
 * 什么是方法？方法的完成格式是啥？
 * 是用于执行特定任务或操作的代码块，可以接收数据进行处理并返回一个处理的结果。
 * 修饰符 返回值类型 方法名(形参列表){
 * 方法体代码(需要执行的功能代码)
 * return 返回值;
 * }
 * 定义满足需求的方法格式，主要考虑哪两方面？
 * 方法是否需要接收数据，方法是否需要返回数据。
 * 方法如何使用？
 * 必须进行调用才可以执行方法；调用格式：方法名称(…)。
 */
public class MethodDemo1 {
    public static void main(String[] args) {
        // 目标：掌握方法的定义和调用。
        int sum = getSum(10, 20);
        System.out.println("和是：" + sum);

        System.out.println("--------------------");

        int sum2 = getSum(100, 200);
        System.out.println("和是：" + sum2);

        printHelloWorld();

        System.out.println("--------------------");

        System.out.println(getCode(4));
        System.out.println(getCode(5));
    }

    // 定义一个方法，求任意两个整数的和并返回
    public static int getSum(int a, int b) {
        return a + b;
    }

    // 需求：打印三行HelloWorld，不需要参数，也不需要返回值。
    // 注意：如果方法没有返回结果，返回值类型必须声明称为void。
    // 无参数，无返回值类型。
    public static void printHelloWorld() {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }

    // 需求3：获取一个指定位数的验证码返回。
    // 掌握方法的定义格式：
    // 需要接收数据吗？ 需要，需要接收位数。 int len
    // 需要返回数据吗？ 需要，返回验证码。 String
    // 有参数有返回值的方法
    public static String getCode(int len) {
        String code = "";
        for (int i = 0; i < len; i++) {
            int num = (int) (Math.random() * 10);
            code += num;
        }
        return code;
    }
}
