package com.liushuo.branch;

import java.util.Scanner;

public class SwitchDemo3 {
    /**
     * 1、switch分支的格式、执行流程是怎么样的？
     * switch(表达式) {
     * case 值1:
     * 执行代码;
     * break;
     * case 值2:
     * 执行代码;
     * break;
     * ...
     * default:
     * 执行代码;
     * }
     * 2、if、switch的比较，各自适合什么业务场景？
     * if其实在功能上远远强大于switch。
     * if适合做条件是区间判断的情况。
     * switch适合做：条件是比较值的情况、代码优雅、性能较好。
     */
    public static void main(String[] args) {
        // 目标：搞清楚switch分支结构的应用和写法，理解其执行流程。
        test1();
    }

    // 需求：根据男女性别的不同，推荐不同的基本信息给其观看。
    public static void test1() {
        // 1.让用户输入自己的性别。
        System.out.println("请输入性别");
        Scanner sc = new Scanner(System.in);
        String sex = sc.next(); // "男" "女" "其他的"

        // 2.根据用户输入的性别这个值，判断该做什么
        switch (sex) {
            case "男":
                System.out.println("推荐《JAVA从入门到精通》");
                break;
            case "女":
                System.out.println("推荐《从你的全世界路过》");
                break;
            default:
                System.out.println("你不是人，没有东西推荐！");
        }
    }
}
