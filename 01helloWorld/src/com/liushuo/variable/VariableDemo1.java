package com.liushuo.variable;

/**
 * 变量是什么，变量的完整定义格式是什么样的？
 * 变量是内存中的一块区域，可以理解成盒子，用来记住程序要处理的数据的。
 * 数据类型 变量名称 = 数据;
 * 为什么要用变量，变量有啥好处？
 * 使用变量记要处理的数据，编写的代码更灵活，管理代码更方便。
 * 变量有什么特点？基于这个特点，变量有啥应用场景？
 * 变量里的数据可以被替换。
 */
public class VariableDemo1 {
    /**
     * 数据在计算机底层都是怎么存储的？
     * 都是采用二进制：使用0、1按照逢二进一的规则表示数据来存储。
     * 如何快速的算出一个数据的二进制形式？
     * 除二取余法
     * 计算机底层表示数据的最小单元是什么？
     * 字节，一个字节等于8个二进制位：1B=8b
     * 字符数据在计算机中是怎么存的？
     * 字符存的是ascii码表中对应的数字的二进制形式。
     * 字符'A'对应的数字是65
     * 字符'a'对应的数字是97
     * 字符'0'对应的数字是48
     * 图片和音视频等文件的数字是怎么存储的？
     * 也是采用二进制进行存储的。
     * 二进制如何计算成十进制？
     * 8 4 2 1
     * 二进制如何计算成八进制？
     * 每3位二进制作为一个单元，最小数是0，最大数是7，0~7有8个数字。
     * 二进制如何计算成十六进制？
     * 每4位二进制作为一个单元，最小数是0，最大数是15
     * 0~15有16个数字，依次用：0~9 A B C D E F 代表
     */
    public static void main(String[] args) {
        // 目标：认识变量
        printVariable();
    }

    // 定义一个方法，来学习变量的定义
    public static void printVariable() {
        // 定义变量：数据类型 变量名称 = 初始值;
        int age = 18;
        System.out.println(age);

        // 定义一个小数变量，存储一个学生的Java成绩
        double score = 99.5;
        System.out.println(score);

        System.out.println("===================");

        // 为什么要用变量记住数据呢？可以提高处理数据的灵活性和维护性。
        int number = 32;
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);

        System.out.println("===================");

        // 研究变量的特点：变量里的数据是可以被替换的
        int age2 = 18;
        age2 = 19; // 赋值 （从右边往左边看）
        System.out.println(age2); // 19

        age2 = age2 + 1; // 赋值 （从右边往左边看）
        System.out.println(age2); // 20

        System.out.println("===================");

        // 需求：微信钱包目前有9.9，发出去了5元，又收到了6元，请实时输出钱包金额。
        double money = 9.9;
        System.out.println(money);

        // 发出去了5元
        money = money - 5;
        System.out.println(money);

        // 又收到了6元
        money = money + 6;
        System.out.println(money);

        System.out.println("===================");

        char ch = 'A'; // 65的二进制
        System.out.println(ch + 1); // 66

        char ch2 = 'a'; // 97的二进制
        System.out.println(ch2 + 1); // 98

        System.out.println("===================");

        // 程序中可以直接写进制数据
        int i1 = 0b01100001; // 二进制 必须以0b开头
        System.out.println(i1);

        int i2 = 0141; // 八进制 必须以0开头
        System.out.println(i2);

        int i3 = 0xFA; // 十六进制 必须以0x开头
        System.out.println(i3);
    }
}
