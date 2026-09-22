package test;

import java.util.Scanner;

public class Test15 {
    //判断质数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = sc.nextInt();

        int temp = num;
        boolean flag = true;

        //for循环版本⭐有范围⭐
        //可以把 (temp - 1) 优化成 temp的平方根，提高效率
//        for (int i = 2; i < temp - 1; i++) {
//            if (temp % i == 0) {
//                flag = false;
////                System.out.println("合数");
//                break;
//            }
//        }


        //while循环版本
        int i = 2;
        while (i < temp - 1){
            if (temp % i == 0){
                flag = false;
                break;
            }
            i ++;
        }

        if (flag){
            System.out.println("是一个质数");
        }else {
            System.out.println("不是一个质数");
        }
    }
}
