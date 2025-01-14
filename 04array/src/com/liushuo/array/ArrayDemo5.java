package com.liushuo.array;

public class ArrayDemo5 {
    public static void main(String[] args) {
        // 目标：二维数组的认识。
        printArray();
        printArray2();
    }

    public static void printArray() {
        // 初始化二维数组存储学生姓名，考虑到座位不规则，直接定义每排的座位
        // 静态初始化
        String[][] classroom = {
                {"张无忌", "赵敏", "周芷若"}, // 0 第一排
                {"张三丰", "宋远桥", "殷梨亭"}, // 1 第二排
                {"灭绝", "陈昆", "玄冥二老", "金毛狮王"}, // 2 第三排
                {"杨逍", "纪晓芙"} // 3 第四排
        };

        // 访问：数组名[行索引]
        String[] names = classroom[2];
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // 访问2：数组名[行索引][列索引]
        System.out.println(classroom[1][1]);
        System.out.println(classroom[2][2]);

        // 长度访问：数组名.length
        System.out.println(classroom.length); // 4
        System.out.println(classroom[3].length); // 2

        // 动态初始化
        int[][] arr = new int[3][5]; // 3行5列
    }

    // 遍历二维数组
    public static void printArray2() {
        String[][] classroom = {
                {"张无忌", "赵敏", "周芷若"}, // 0 第一排
                {"张三丰", "宋远桥", "殷梨亭"}, // 1 第二排
                {"灭绝", "陈昆", "玄冥二老", "金毛狮王"}, // 2 第三排
                {"杨逍", "纪晓芙"} // 3 第四排
        };

        for (int i = 0; i < classroom.length; i++) {
            // i = 0 1 2 3
            String[] names = classroom[i];
            for (int j = 0; j < names.length; j++) {
                System.out.print(names[j] + "\t");
            }
            System.out.println();
        }

        System.out.println("-------另一种遍历方式---------");

        for (int i = 0; i < classroom.length; i++) {
            for (int j = 0; j < classroom[i].length; j++) {
                System.out.print(classroom[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
