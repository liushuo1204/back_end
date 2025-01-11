package com.liushuo.operator;

/**
 * 算数运算符有哪些？
 * + - * / %
 * / 需要注意什么，为什么？
 * 如果两个整数做除法，其结果一定是整数，因为最高类型是整数。
 * + 除了做基本的数学运算，还有哪些功能？
 * 与字符串做+运算时会被当作连接符，其结果还是字符串。
 * 识别技巧：能算则算，不能算就在一起。
 */
public class OperatorDemo1 {
    public static void main(String[] args) {
        // 目标：搞清楚基本的算术运算符
        // print(10,2);
        print(10, 3);

        System.out.println("=========================");

        print2();
    }

    public static void print(int a, int b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b); // 3.3333... ==> 3
        System.out.println(1.0 * a / b); // 3.3333...
        System.out.println(a % b);
    }

    // 需求：研究+符号做连接符合适做运算符
    public static void print2() {
        int a = 5;
        System.out.println("abc" + a); // abc5
        System.out.println(a + 5); // 10
        System.out.println("liu" + a + 'a'); // liu5a
        System.out.println(a + 'a' + "liu"); // 102liu
    }
}
