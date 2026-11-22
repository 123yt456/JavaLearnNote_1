package test;

import java.util.Scanner;

public class Test18 {
    //飞机票价格
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double price = sc.nextInt();

        System.out.println("请输入购买月份：");
        int month = sc.nextInt();

        System.out.println("请输入 0 头等舱 或 1 经济舱：");
        int plane = sc.nextInt();

        double result = getPrice(price, month, plane);
        System.out.println("打折后的机票价格为：" + result);

    }

    public static double getPrice(double price, int month,int plane){
        if (month >= 5 && month <= 10){
            if (plane == 0){
                price *= 0.9;
                return price;
            } else if (plane == 1){
                price *= 0.85;
                return price;
            }else {
                System.out.println("没有这个舱位");
            }
        }else if ((month >= 11 && month <= 12 )|| (month >= 1 && month <= 4)){
            if (plane == 0){
                price *= 0.7;
                return price;
            } else if (plane == 1){
                price *= 0.65;
                return price;
            }else {
                System.out.println("没有这个舱位");
            }
        }else {
            System.out.println("输入的月份有误，请重新输入！");
        }
        return price;
    }
}