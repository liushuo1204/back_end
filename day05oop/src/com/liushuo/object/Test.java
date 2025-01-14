package com.liushuo.object;

public class Test {
    public static void main(String[] args) {
        // 目标：学会创建对象
        // 创建对象的格式：类名 对象名 = new 类名();
        Star s1 = new Star();
        s1.name = "王祖贤";
        s1.age = 30;
        s1.gender = "女";
        s1.height = 172.5;
        s1.weight = 50.5;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.gender);
        System.out.println(s1.height);
        System.out.println(s1.weight);

        // 创建对象，存储杨幂的数据
        Star s2 = new Star();
        s2.name = "杨幂";
        s2.age = 32;
        s2.gender = "女";
        s2.height = 168.5;
        s2.weight = 45.5;
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.gender);
        System.out.println(s2.height);
        System.out.println(s2.weight);
    }
}
