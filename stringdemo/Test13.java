package stringdemo;

import java.util.Scanner;

public class Test13 {
    //判断对称字符串
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        //以下可以写成链式法则
        //将字符串存入StringBuilding
        StringBuilder sb = new StringBuilder(str);
        //获取反转字符串
        sb.reverse();
        String reverString = sb.toString();

        if (str.equals(reverString)){
            System.out.println("是对称字符串");
        }else {
            System.out.println("不是对称字符串");
        }
//        System.out.println(str);
//        System.out.println(reverString);
    }
}
