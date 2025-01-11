package com.liushuo.operator;

/**
 * 逻辑运算符有哪些，有什么特点？
 * &：有一个为 false、结果是 false
 * &&：有一个为 false、结果是 false，但前一个为 false，后一个条件不执行了
 * |：有一个为 true、结果是 true
 * ||：有一个为 true、结果是 true，但前一个为 true，后一个条件不执行了
 * !：!false = true、!true = false
 * ^：相同条件为 false，不同条件为 true
 * 注意：实际开发中、常用的逻辑运算符还是：&&、||、!
 */
public class OperatorDemo6 {
    public static void main(String[] args) {
        // 目标：掌握逻辑运算符的使用。
        System.out.println(isMatch(180, 70, '女'));
        System.out.println(isMatch(180, 70, '男')); // false

        System.out.println(isMatch2(180, 10000));
        System.out.println(isMatch2(160, 1000000));
        System.out.println(isMatch2(160, 100)); // false

        isMatch3(true);

        System.out.println("--------------------");

        isMatch4();

        System.out.println("--------------------");

        print();
    }

    // 需求：判断某个人的条件是否满足条件，如果满足返回true，否则是false
    // 条件是，身高高于170，体重在60~80之间，且性别为女。
    // & 必须前后条件都是 true 结果才是 true，只要有一个 false，结果一定是 false。
    public static boolean isMatch(int height, int weight, char sex) {
        boolean result = height > 170 & weight >= 60 & weight <= 80 & sex == '女';
        return result;
    }

    // 需求：找一个男朋友，要求是要么身高高于180，要么收入高于30万。
    // | 只要前后条件有一个为 true，结果一定是 true，必须都是 false 结果才是 false。
    public static boolean isMatch2(int height, int income) {
        boolean result = height >= 180 | income > 30000;
        return result;
    }

    // ！非，你真我假，你假我真
    public static void isMatch3(boolean flag) {
        System.out.println(!flag);
    }

    // ^ 异或，相同条件结果为 false，条件不同为 true。
    public static void isMatch4() {
        System.out.println(false ^ false); // true
        System.out.println(true ^ true); // true
        System.out.println(true ^ false); // false
        System.out.println(false ^ true); // false
    }

    // 判断 && || 与 & | 的区别。
    public static void print() {
        int a = 111;
        int b = 2;
        // System.out.println(a > 1000 && ++b > 1); // false && 发现左边条件为 false 右边直接不执行
        System.out.println(a > 1000 & ++b > 1); // false & 即便发现左边条件为 false 右边依然执行
        System.out.println(b); // 3

        int i = 10;
        int j = 20;
        // System.out.println(i > 6 || ++j > 1); // true || 发现左边条件为 true 右边直接不执行
        System.out.println(i > 6 | ++j > 1); // true | 即便发现左边条件为 true 右边依然执行
        System.out.println(j);
    }
}
