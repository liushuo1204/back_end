package com.liushuo.array;

public class ArrayTest4 {
    public static void main(String[] args) {
        // 目标：完成做牌和洗牌。
        start();
    }

    public static void start() {
        // 1、做牌：创建一个动态初始化的数组存储54张牌。
        String[] poker = new String[54];
        // poker = [null, null, null, null, null, null, null, ...]
        //           0      1     2     3     4     5     6

        // 2、准备四种花色，还有点数，再开始做牌存入数组中去。
        String[] colors = {"♠", "♥", "♣", "♦"};
        //                  j
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        //                   i

        // 3、遍历点数，再遍历花色
        int index = 0; // 定义一个变量记录牌存储的索引位置。
        for (int i = 0; i < numbers.length; i++) {
            // 当前点数：numbers[i]
            for (int j = 0; j < colors.length; j++) {
                // 4、将牌存入数组中去。
                poker[index++] = colors[j] + numbers[i];
            }
        }

        // 4、将大小王存入数组中去。
        poker[index++] = "🃏";
        poker[index] = "👲";

        // 5、打印牌
        System.out.println("新牌：");
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + "\t");
        }
        System.out.println(); // 换行

        // 6、洗牌：把54张牌的数组poker中的牌顺序打乱。
        // poker = [♠2	♥2	♣2	♦2	♠A	♥A	♣A	♦A	♠K	♥K	♣K	♦K	♠Q ...]
        //           0   1   2   3   4   5   6   7   8  9    10  11  12 ...
        for (int i = 0; i < poker.length; i++) {
            // 随机获取一个索引。
            int index1 = (int) (Math.random() * poker.length); // [0, 54) => [0, 53]
            // 随机获取另一个索引。
            int index2 = (int) (Math.random() * poker.length); // [0, 54) => [0, 53]

            // 每一次都需要让index1和index2这两个索引位置处的的数据进行交换
            // 1、定义一个临时变量，用于存储index2索引位置处的数据。
            String temp = poker[index2];
            // 2、将index1索引位置处的数据，赋值给index2索引位置处。
            poker[index2] = poker[index1];
            // 3、将临时变量中的数据，赋值给index1索引位置处。
            poker[index1] = temp;
        }

        System.out.println("洗牌后：");
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + "\t");
        }
    }
}
