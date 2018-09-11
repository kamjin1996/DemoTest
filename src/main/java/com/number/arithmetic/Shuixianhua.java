package com.number.arithmetic;

/**
 * @Date: 2018/09/10 下午 5:31
 * @Auther: KAM
 * @Description: //水仙花数
 * @Version: 1.0
 */
public class Shuixianhua {
    public static void main(String[] args) {
        int x = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 100; i < 999; i++) {
            a = i / 100;
            b = i / 10 % 10;
            c = i % 10;
            if (i == (a * a * a + b * b * b + c * c * c)){
                x++;
            System.out.println(i);
            }
        }
        System.out.println("总计:" + x);

    }
}