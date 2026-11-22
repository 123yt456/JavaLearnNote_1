package test;

import java.util.Scanner;

public class Test14 {

    public static void main(String[] args) {
        //求平方根
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于二的整数：");
        int num = sc.nextInt();

        int temp = num;
        if (temp >= 2) {
            int i = 1;
            while (i * i < temp){
                i ++;
                if (i * i > temp){
                    System.out.println(i - 1 + "就是" + num + "平方根的整数部分");
                    break;
                }
                if (i * i == temp){
                    System.out.println(i + "就是" + num + "的平方根");
                    break;
                }
            }
        } else {
            System.out.println("输入的数字不正确，请重新输入！");
        }


    }
}
