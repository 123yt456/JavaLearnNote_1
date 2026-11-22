package test;

import java.util.Scanner;

public class Test9 {
    //回文数
    //自练习版
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();

        if (num >= 0) {
            int digitCount = 1;
            for (int t = 10; num / t != 0; t *= 10) {
                digitCount++;
            }
        System.out.println(digitCount);

            int weight = 1;

            for (int dig = digitCount; dig - 1 != 0; dig--) {
                weight *= 10;
            }
//        System.out.println(weight);
            int pow1 = 10;
            for (int i = 1; i <= digitCount; Math.pow(pow1,10)) {
                int last = num % pow1;
                i ++;
                for (int i2 = 1; i2 <= digitCount; weight /= 10) {
                    int before = num % weight;
                    i2 ++;

                    if ((last * weight) + before == num) {
                        System.out.println("是回文整数");
                    } else {
                        System.out.println("不是回文整数");
                       break;
                    }
                }
            }





//        if (num % 10 == num / 100 % 10 ){
//            System.out.println("是回文数");
//        }else {
//            System.out.println("不是回文数");
//        }

        } else {
            System.out.println("不是回文整数");
        }


    }
}
